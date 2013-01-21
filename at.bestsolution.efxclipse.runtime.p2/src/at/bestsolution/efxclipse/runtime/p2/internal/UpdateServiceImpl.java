/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.p2.internal;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.equinox.p2.core.IProvisioningAgent;
import org.eclipse.equinox.p2.core.ProvisionException;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;
import org.eclipse.equinox.p2.operations.ProvisioningJob;
import org.eclipse.equinox.p2.operations.ProvisioningSession;
import org.eclipse.equinox.p2.operations.SynchronizeOperation;
import org.eclipse.equinox.p2.query.IQueryable;
import org.eclipse.equinox.p2.query.QueryUtil;
import org.eclipse.equinox.p2.repository.IRepositoryManager;
import org.eclipse.equinox.p2.repository.artifact.IArtifactRepositoryManager;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepository;
import org.eclipse.equinox.p2.repository.metadata.IMetadataRepositoryManager;
import org.osgi.framework.ServiceReference;

import at.bestsolution.efxclipse.runtime.core.Callback;
import at.bestsolution.efxclipse.runtime.core.log.Logger;
import at.bestsolution.efxclipse.runtime.core.log.Logger.Level;
import at.bestsolution.efxclipse.runtime.core.log.LoggerFactory;
import at.bestsolution.efxclipse.runtime.core.update.UpdateService;

public class UpdateServiceImpl implements UpdateService {
	private Logger logger;
	private LoggerFactory factory;

	static class P2UpdateCheckRV extends ReturnValueImpl<Boolean> implements
			UpdateCheckData {
		public final IProvisioningAgent agent;
		public final IQueryable<IInstallableUnit> installUnits;

		public P2UpdateCheckRV(IProvisioningAgent agent,
				IQueryable<IInstallableUnit> installUnits, State state,
				String message, Boolean value, Throwable throwable) {
			super(state, message, value, throwable);
			this.agent = agent;
			this.installUnits = installUnits;
		}
	}

	static class P2UpdateRV extends ReturnValueImpl<Boolean> implements
			UpdateData {

		public P2UpdateRV(State state, String message, Boolean value,
				Throwable throwable) {
			super(state, message, value, throwable);
		}
	}

	public void setLoggerFactory(LoggerFactory factory) {
		this.factory = factory;
		if (logger != null) {
			logger = null;
		}
	}

	public void unsetLoggerFactory(LoggerFactory factory) {
		this.factory = null;
		this.logger = null;
	}

	private Logger getLogger() {
		if (logger == null) {
			logger = factory.createLogger(getClass().getName());
		}
		return logger;
	}

	@Override
	public void update(UpdateCheckData data, Callback<UpdateData> callback) {
		IProvisioningAgent agent = ((P2UpdateCheckRV) data).agent;
		IQueryable<IInstallableUnit> installUnits = ((P2UpdateCheckRV) data).installUnits;
		try {
			installUnits(agent, installUnits, new NullProgressMonitor());
			callback.call(new P2UpdateRV(State.OK, "Update successfull",
					Boolean.TRUE, null));
		} catch (Exception e) {
			callback.call(new P2UpdateRV(State.ERROR, "Failed to update",
					Boolean.FALSE, e));
		}
	}

	@Override
	public void checkUpdate(Callback<UpdateCheckData> callback) {
		try {
			IProvisioningAgent agent = getProvisioningAgent();
			IQueryable<IInstallableUnit> installUnits = collectUpdateableUnits(
					agent, new NullProgressMonitor());
			if (installUnits == null) {
				callback.call(new P2UpdateCheckRV(agent, installUnits,
						State.CANCEL, "Nothing to update", Boolean.TRUE, null));
			} else {
				callback.call(new P2UpdateCheckRV(agent, installUnits,
						State.OK, "Updates available", Boolean.TRUE, null));
			}
		} catch (Exception e) {
			callback.call(new P2UpdateCheckRV(null, null, State.ERROR,
					"Failure while try to collect updateable units", null, e));
		}
	}

	private IProvisioningAgent getProvisioningAgent() throws ProvisionException {
		ServiceReference<?> reference = Activator.getContext()
				.getServiceReference(IProvisioningAgent.SERVICE_NAME);
		IProvisioningAgent agent = (IProvisioningAgent) Activator.getContext()
				.getService(reference);
		return agent;
	}

	protected IQueryable<IInstallableUnit> collectUpdateableUnits(
			IProvisioningAgent agent, final IProgressMonitor monitor)
			throws ProvisionException {
		IRepositoryManager<?> manager = (IRepositoryManager<?>) agent
				.getService(IMetadataRepositoryManager.class.getName());

		// Get update site uri's from p2.inf.

		final StringBuffer siteUrlPackage = new StringBuffer();

		URI[] uris = manager
				.getKnownRepositories(IRepositoryManager.REPOSITORIES_ALL);

		if (uris.length == 0) {
			getLogger().warning("no update repositories found");
		} else {
			for (URI uri : uris) {
				if (siteUrlPackage.length() > 0) {
					siteUrlPackage.append(",");
				}
				// LOGGER.info( "uri found: " + uri.toString() );
				siteUrlPackage.append(uri.toString());
			}
		}

		if (siteUrlPackage == null || siteUrlPackage.toString().isEmpty()) {
			throw new IllegalStateException(
					"No site URL specified. Edit your p2.inf file.");
		}

		getLogger().info( "Synch repos: " + siteUrlPackage );

		String[] siteUrlStrings = siteUrlPackage.toString().split(",");
		URI[] siteURIs = new URI[siteUrlStrings.length];
		for (int i = 0; i < siteURIs.length; i++) {
			try {
				siteURIs[i] = new URI(siteUrlStrings[i]);
			} catch (URISyntaxException e) {
				throw new IllegalStateException(e);
			}
		}

		// Convert URIs into something we can query...
		IQueryable<IInstallableUnit> allTheIUs = createIUQueryable(siteURIs,
				agent, monitor);
		getLogger().debug("query result: " + allTheIUs);

		return allTheIUs;

	}

	public void installUnits(final IProvisioningAgent agent,
			IQueryable<IInstallableUnit> allTheIUs, IProgressMonitor monitor) {
		ProvisioningSession session = new ProvisioningSession(agent);
		/*
		 * Query the metadata repository(ies) for the feature(s) to install.
		 */
		Collection<IInstallableUnit> toInstall = allTheIUs.query(
				QueryUtil.createIUGroupQuery(), new NullProgressMonitor())
				.toUnmodifiableSet();
		getLogger().info("Everything to synchronize:");
		logQueryResults(toInstall);

		SynchronizeOperation operation = new SynchronizeOperation(session,
				toInstall);
		IStatus opStatus = operation.resolveModal(monitor);
		if (opStatus.isOK()) {
			ProvisioningJob job = operation.getProvisioningJob(null);
			opStatus = job.runModal(monitor);
			if (opStatus.getSeverity() == IStatus.CANCEL)
				throw new OperationCanceledException();
		}
	}

	private void logQueryResults(Collection<IInstallableUnit> toInstall) {
		if (getLogger().isEnabled(Level.DEBUG)) {
			StringBuffer iuNames = new StringBuffer("IUs:\n\n ");
			for (IInstallableUnit iu : toInstall) {
				iuNames.append(iu.getId() + iu.getVersion() + "\n ");
			}
			getLogger().debug(iuNames.toString());
		}
	}

	private IQueryable<IInstallableUnit> createIUQueryable(URI[] p2Sites,
			IProvisioningAgent agent, IProgressMonitor monitor)
			throws ProvisionException {
		IMetadataRepositoryManager metadataManager = (IMetadataRepositoryManager) agent
				.getService(IMetadataRepositoryManager.SERVICE_NAME);
		IArtifactRepositoryManager artifactManager = (IArtifactRepositoryManager) agent
				.getService(IArtifactRepositoryManager.SERVICE_NAME);

		final Collection<IMetadataRepository> metadataReposList = new LinkedList<IMetadataRepository>();
		for (URI uri : p2Sites) {
			getLogger().debug("Adding metadata repo at: " + uri.toString());
			try {
				IMetadataRepository metadataRepo = metadataManager
						.loadRepository(uri, monitor);
				getLogger().debug(
						"metadata repository loaded: " + uri.toString());
				try {
					artifactManager.loadRepository(uri, monitor); // load the
																	// repo:
																	// this
																	// makes it
																	// available
																	// to us
					metadataReposList.add(metadataRepo);
				} catch (NullPointerException e) {
					getLogger()
							.warning(
									"Repository " + uri
											+ " not found, will be ignored", e);
				}
			} catch (ProvisionException e) {
				if (e.getStatus().getCode() == ProvisionException.REPOSITORY_NOT_FOUND) {
					getLogger()
							.warning(
									"Repository " + uri
											+ " not found, will be ignored");
				} else {
					getLogger()
							.warning(
									"ProvisionException code="
											+ e.getStatus().getCode()
											+ ", return none");
					throw e;
				}
			} catch (OperationCanceledException e) {
				getLogger().warning("OperationCanceledException, return none");
				throw e;
			}
		}
		if (metadataReposList.isEmpty()) {
			getLogger().debug("seems to be correct, return NONE");
			return null;
		} else {
			getLogger().debug("seems to be correct, return SOME");
			return QueryUtil.compoundQueryable(metadataReposList);
		}
	}
}

/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.pde.ui.classpath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.launching.environments.EnvironmentsManager;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.ImportPackageSpecification;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.BuildPathSupport;
import at.bestsolution.efxclipse.tooling.pde.adaptor.IClasspathContributor;

@SuppressWarnings("restriction")
public class JavaFXClassPathExtender implements IClasspathContributor {
	@Override
	public List<Contribution> getDynamicContributions(BundleDescription desc) {
		for( String e : desc.getExecutionEnvironments() ) {
			IExecutionEnvironment env = EnvironmentsManager.getDefault().getEnvironment(e);
			IPath[] paths = null;
			
			if( env.getDefaultVM() != null ) {
				paths = BuildPathSupport.getFxJarPath(env.getDefaultVM());
			}
			
			if( paths == null || paths[0] == null && ! paths[0].toFile().exists() ) {
				for( IVMInstall i : env.getCompatibleVMs() ) {
					paths = BuildPathSupport.getFxJarPath(i);
					if( paths != null &&  paths[0] != null && paths[0].toFile().exists() ) {
						break;
					}
				}	
			}
			
			if( paths != null &&  paths[0] != null && paths[0].toFile().exists() ) {
				List<Rule> l = new ArrayList<Rule>();
				for( ImportPackageSpecification i : desc.getImportPackages() ) {
					if( i.getName().startsWith("javafx") ) {
						l.add(new Rule(new Path(i.getName().replace('.', '/')+"/*"),false));
					} else if( i.getName().contains("javafx") ) {
						l.add(new Rule(new Path(i.getName().replace('.', '/')+"/*"),true));
					}
				}
				
				return Collections.singletonList(new Contribution(paths[0], paths[1] == null || !paths[1].toFile().exists() ? BuildPathSupport.WEB_JAVADOC_LOCATION : paths[1].toFile().toURI().toString(), null, null, l.toArray(new Rule[0])));
			}
		}
		
		return Collections.emptyList();
	}
	
	@Override
	public List<Contribution> getContributions(BundleDescription desc) {
		return Collections.emptyList();
	}

	@Override
	public boolean isActiveFor(BundleDescription desc) {
		return false;
	}

	@Override
	public List<String> exportEnvironmentLibraryAdditions(String environmentId) {
		IExecutionEnvironment env = EnvironmentsManager.getDefault().getEnvironment(environmentId);
		IPath[] paths = null;
		
		if( env.getDefaultVM() != null ) {
			paths = BuildPathSupport.getFxJarPath(env.getDefaultVM());
		}
		
		if( paths == null || paths[0] == null && ! paths[0].toFile().exists() ) {
			for( IVMInstall i : env.getCompatibleVMs() ) {
				paths = BuildPathSupport.getFxJarPath(i);
				if( paths != null &&  paths[0] != null && paths[0].toFile().exists() ) {
					break;
				}
			}	
		}
		
		if( paths != null &&  paths[0] != null && paths[0].toFile().exists() ) {
			return Collections.singletonList(paths[0].toFile().getAbsolutePath());
		}
		
		return Collections.emptyList();
	}

}

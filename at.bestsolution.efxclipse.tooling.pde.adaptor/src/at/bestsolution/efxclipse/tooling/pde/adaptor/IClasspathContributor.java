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
package at.bestsolution.efxclipse.tooling.pde.adaptor;

import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathAttribute;
import org.eclipse.osgi.service.resolver.BundleDescription;

public interface IClasspathContributor {
	public static class Rule {
		public final IPath path;
		public final boolean discouraged;
		
		public Rule(IPath path, boolean discouraged) {
			this.path = path;
			this.discouraged = discouraged;
		}
	}
	public static class Contribution {
		public final IPath jarLocation;
		public final String javaDocLocation;
		public final IPath sourceLocation;
		public final IClasspathAttribute[] attributes;
		public final Rule[] rules;
		
		public Contribution(IPath jarLocation, String javaDocLocation, IPath sourceLocation, IClasspathAttribute[] attributes, Rule[] rules) {
			super();
			this.jarLocation = jarLocation;
			this.javaDocLocation = javaDocLocation;
			this.sourceLocation = sourceLocation;
			this.attributes = attributes;
			this.rules = rules;
		}
	}
	
	public List<Contribution> getDynamicContributions(BundleDescription desc);
	public List<Contribution> getContributions(BundleDescription desc);
	public boolean isActiveFor(BundleDescription desc);
	public List<String> exportEnvironmentLibraryAdditions(String environmentId);
}

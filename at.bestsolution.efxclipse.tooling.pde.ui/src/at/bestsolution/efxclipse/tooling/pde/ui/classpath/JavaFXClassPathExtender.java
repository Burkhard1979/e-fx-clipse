package at.bestsolution.efxclipse.tooling.pde.ui.classpath;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.internal.launching.environments.EnvironmentsManager;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.environments.IExecutionEnvironment;
import org.eclipse.osgi.service.resolver.BundleDescription;

import at.bestsolution.efxclipse.tooling.jdt.core.internal.BuildPathSupport;
import at.bestsolution.efxclipse.tooling.pde.adaptor.IClasspathContributor;

@SuppressWarnings("restriction")
public class JavaFXClassPathExtender implements IClasspathContributor {
	
	@Override
	public List<Contribution> getContributions(BundleDescription desc) {
		for( String e : desc.getExecutionEnvironments() ) {
			IExecutionEnvironment env = EnvironmentsManager.getDefault().getEnvironment(e);

			if( env.getDefaultVM() != null ) {
				IPath[] paths = BuildPathSupport.getFxJarPath(env.getDefaultVM());
				
				if( paths != null && paths[0] != null ) {
					return Collections.singletonList(new Contribution(paths[0], paths[1] == null || !paths[1].toFile().exists() ? BuildPathSupport.WEB_JAVADOC_LOCATION : paths[1].toFile().toURI().toString(), null, null));
				}
			}
			
			for( IVMInstall i : env.getCompatibleVMs() ) {
				IPath[] paths = BuildPathSupport.getFxJarPath(i);
				if( paths != null &&  paths[0] != null && paths[0].toFile().exists() ) {
					return Collections.singletonList(new Contribution(paths[0], paths[1] == null || !paths[1].toFile().exists() ? BuildPathSupport.WEB_JAVADOC_LOCATION : paths[1].toFile().toURI().toString(), null, null));
				}
			}
		}
		
		return Collections.emptyList();
	}

	@Override
	public boolean isActiveFor(BundleDescription desc) {
		return "at.bestsolution.efxclipse.runtime.javafx".equals(desc.getName());
	}

	@Override
	public List<String> exportEnvironmentLibraryAdditions(String environmentId) {
		System.err.println("Fetching library for env: " + environmentId);
//		IPath[] paths = BuildPathSupport.getPreferencePaths();
//		
//		if( paths != null && paths[0] != null ) {
//			return Collections.singletonList(paths[0].toOSString());
//		}
//		
		return Collections.emptyList();
	}

}

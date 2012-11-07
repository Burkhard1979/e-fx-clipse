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
package at.bestsolution.efxclipse.tooling.build;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class ConfigFixTask extends Task  {
	private String rootFolder;
	
	public void setRootFolder(String rootFolder) {
		this.rootFolder = rootFolder;
	}
	
	public String getRootFolder() {
		return rootFolder;
	}
	
	@Override
	public void execute() throws BuildException {
		File configurationFolder = new File(rootFolder,"configuration");
		File pluginFolder = new File(rootFolder, "plugins");
		
		String extensionFile = null;
		for( File f : pluginFolder.listFiles() ) {
			if( f.getName().startsWith("at.bestsolution.efxclipse.runtime.osgi") ) {
				extensionFile = f.getName();
			}
		}
		
		if( extensionFile == null ) {
			throw new IllegalStateException("No fx extension found");
		}
		
		File configIni = new File(configurationFolder, "config.ini");
		FileWriter w;
		try {
			w = new FileWriter(configIni, true);
			w.append("osgi.framework.extensions=reference\\:file\\:" + extensionFile);
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

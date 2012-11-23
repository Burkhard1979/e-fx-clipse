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
package at.bestsolution.efxclipse.runtime.core.log;

public interface Logger {
	public void log(Level level, String message, Throwable... t);
	
	public void trace(String message, Throwable... t);
	
	public void debug(String message, Throwable... t);
	
	public void info(String message, Throwable... t);
	
	public void warning(String message, Throwable... t);
	
	public void error(String message, Throwable... t);
	
	public void fatal(String message, Throwable... t);
	
	public boolean isEnabled(Level level);
	
	public enum Level {
		TRACE,
		DEBUG,
		INFO,
		WARNING,
		ERROR,
		FATAL
	}
}

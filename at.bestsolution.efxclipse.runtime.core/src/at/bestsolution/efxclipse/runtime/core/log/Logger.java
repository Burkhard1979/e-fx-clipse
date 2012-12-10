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
	
	public void log(Level level, String message);
	public void log(Level level, String message, Throwable t);
	
	public void logf(Level level, String pattern, Object...args);
	public void logf(Level level, String pattern, Throwable t, Object...args);
	
	public void trace(String message);
	public void debug(String message);
	public void info(String message);
	public void warning(String message);
	public void error(String message);
	public void fatal(String message);
	
	public void trace(String message, Throwable t);
	public void debug(String message, Throwable t);
	public void info(String message, Throwable t);
	public void warning(String message, Throwable t);
	public void error(String message, Throwable t);
	public void fatal(String message, Throwable t);
	
	public void tracef(String pattern, Object...args);
	public void debugf(String pattern, Object...args);
	public void infof(String pattern, Object...args);
	public void warningf(String pattern, Object...args);
	public void errorf(String pattern, Object...args);
	public void fatalf(String pattern, Object...args);
	
	public void tracef(String pattern, Throwable t, Object...args);
	public void debugf(String pattern, Throwable t, Object...args);
	public void infof(String pattern, Throwable t, Object...args);
	public void warningf(String pattern, Throwable t, Object...args);
	public void errorf(String pattern, Throwable t, Object...args);
	public void fatalf(String pattern, Throwable t, Object...args);
	
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

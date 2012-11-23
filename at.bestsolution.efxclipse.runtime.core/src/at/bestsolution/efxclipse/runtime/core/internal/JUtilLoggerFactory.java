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
package at.bestsolution.efxclipse.runtime.core.internal;

import at.bestsolution.efxclipse.runtime.core.Logger;
import at.bestsolution.efxclipse.runtime.core.LoggerFactory;

public class JUtilLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger(String name) {
		return null;
	}

	static class LoggerImpl implements Logger {
		private java.util.logging.Logger logger;
		
		private String name;
		
		public LoggerImpl(String name) {
			this.name = name;
		}
		
		private java.util.logging.Logger getLogger() {
			if( logger == null ) {
				logger = java.util.logging.Logger.getLogger(name);
			}
			return logger;
		}
		
		private static java.util.logging.Level toLogLevel(Level level) {
			switch (level) {
			case TRACE:
				return java.util.logging.Level.FINEST;
			case DEBUG:
				return java.util.logging.Level.FINE;
			case INFO:
				return java.util.logging.Level.INFO;
			case WARNING:
				return java.util.logging.Level.WARNING;
			case ERROR:
				return java.util.logging.Level.SEVERE;
			case FATAL:
				return java.util.logging.Level.SEVERE;
			default:
				return java.util.logging.Level.SEVERE;
			}
		}
		
		@Override
		public void log(Level level, String message, Throwable... t) {
			java.util.logging.Level jlevel = toLogLevel(level);
			if( t == null || t.length == 0 ) {
				getLogger().log(jlevel, message);
			} else if( t.length == 1 ) {
				getLogger().log(jlevel, message, t);
			} else {
				java.util.logging.Logger l = getLogger();
				for( Throwable th : t ) {
					l.log(jlevel, message, th);
				}
			}
		}

		@Override
		public void trace(String message, Throwable... t) {
			log(Level.TRACE,message,t);
		}

		@Override
		public void debug(String message, Throwable... t) {
			log(Level.DEBUG,message,t);
		}

		@Override
		public void info(String message, Throwable... t) {
			log(Level.INFO,message,t);
		}

		@Override
		public void warning(String message, Throwable... t) {
			log(Level.WARNING,message,t);
		}

		@Override
		public void error(String message, Throwable... t) {
			log(Level.ERROR,message,t);
		}

		@Override
		public void fatal(String message, Throwable... t) {
			log(Level.FATAL,message,t);
		}

		@Override
		public boolean isEnabled(Level level) {
			return getLogger().isLoggable(toLogLevel(level));
		}		
	}
}
/*******************************************************************************
 * Copyright (c) 2011 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.tooling.css;

import java.io.IOException;
import java.io.Reader;

import org.antlr.runtime.CharStream;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.nodemodel.impl.NodeModelBuilder;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.serializer.ISerializer;

import at.bestsolution.efxclipse.tooling.css.conversion.CssTerminalConverters;
import at.bestsolution.efxclipse.tooling.css.parser.antlr.CssDslParser;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class CssDslRuntimeModule extends at.bestsolution.efxclipse.tooling.css.AbstractCssDslRuntimeModule {

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return CssTerminalConverters.class;
	}
	
	/* (non-Javadoc)
	 * @see at.bestsolution.efxclipse.tooling.css.AbstractCssDslRuntimeModule#bindIParser()
	 */
	@Override
	public Class<? extends IParser> bindIParser() {
		return DBGParser.class;
	}
	
	public static class DBGParser extends CssDslParser {
		
		/* (non-Javadoc)
		 * @see org.eclipse.xtext.parser.antlr.AbstractAntlrParser#isReparseSupported()
		 */
		@Override
		protected boolean isReparseSupported() {
			// TODO Auto-generated method stub
			return super.isReparseSupported();
		}
		
		/* (non-Javadoc)
		 * @see org.eclipse.xtext.parser.antlr.AbstractAntlrParser#doParse(java.lang.String, org.antlr.runtime.CharStream, org.eclipse.xtext.nodemodel.impl.NodeModelBuilder, int)
		 */
		@Override
		protected IParseResult doParse(String ruleName, CharStream in, NodeModelBuilder nodeModelBuilder, int initialLookAhead) {
			System.err.println("doParse(" + ruleName + ", ..)");
			
			return super.doParse(ruleName, in, nodeModelBuilder, initialLookAhead);
		}
		
		@Override
		public IParseResult doParse(Reader r) {
			if (r.markSupported()) {
				try {
					r.mark(100);
					char[] cbuf = new char[100];
					r.read(cbuf, 0, 100);
					System.err.println("doParse("+String.valueOf(cbuf)+")");
					r.reset();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else {
				System.err.println("doParse( NO MARK SUPPORTED )");
			}
			return super.doParse(r);
		}
		
		
	}
}

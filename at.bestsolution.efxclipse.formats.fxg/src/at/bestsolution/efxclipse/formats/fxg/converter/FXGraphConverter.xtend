/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Martin Bluehweis<martin.bluehweis@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.formats.fxg.converter

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import

class FXGraphConverter {
	def generate(Model model) '''
	«IF model.getPackage()?.name?.length > 0»
	package «model.getPackage().name»
	«ENDIF»
	«IF model.imports.size > 0»

	«ENDIF»
	«FOR Import imp : model.imports»
		import «imp.importedNamespace»
	«ENDFOR»

	component «model.componentDef.name» {
		
	}
	'''
}
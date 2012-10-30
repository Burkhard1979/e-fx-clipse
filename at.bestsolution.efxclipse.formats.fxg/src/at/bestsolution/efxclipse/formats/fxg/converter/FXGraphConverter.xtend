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

import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Define
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Element
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Import
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Model
import at.bestsolution.efxclipse.tooling.fxgraph.fXGraph.Property

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

	component «model.componentDef.name»«IF !model.componentDef.previewCssFiles.empty» styledwith ["«FOR String css : model.componentDef.previewCssFiles»«css»«ENDFOR»"]«ENDIF»«IF model.componentDef.previewResourceBundle != null» resourcefile "«model.componentDef.previewResourceBundle»"«ENDIF» {
		«FOR Define d : model.componentDef.defines»
			«generate(d.element)»
		«ENDFOR»	
	}
	'''

	def generate(Element parent) '''
		«parent.name» {
		«IF parent.properties.size > 0»
		«FOR i:1..parent.properties.size»
		«val boolean comma= i<parent.properties.size || parent.defaultChildren.size > 0 »
			«val Property p = parent.properties.get(i-1)»
			«IF p.modifier != null »
			«p.name» : «p.modifier» {
			«new ValuePropertyFormatter(p.value).formattedValue»«IF comma»,«ENDIF»
			}
			«ELSE»
			«p.name» : "«new ValuePropertyFormatter(p.value).formattedValue»"«IF comma»,«ENDIF»
			«ENDIF»
		«ENDFOR»	
		«ENDIF»	
		«IF parent.defaultChildren.size > 0»
			children : [
			«FOR i:1..parent.defaultChildren.size»
				«val Element child = parent.defaultChildren.get(i-1)»
				«generate(child)»«IF i<parent.defaultChildren.size»,«ENDIF»
			«ENDFOR»	
			]
		«ENDIF»	
		}'''
}
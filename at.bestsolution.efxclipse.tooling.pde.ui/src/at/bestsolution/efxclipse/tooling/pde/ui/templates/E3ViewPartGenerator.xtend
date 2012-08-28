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
package at.bestsolution.efxclipse.tooling.pde.ui.templates

import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator
import at.bestsolution.efxclipse.tooling.ui.wizards.template.JDTElement

class E3ViewPartGenerator implements IGenerator<JDTElement> {

	override generateContent(JDTElement clazzDef) '''
	«IF(clazzDef.packageFragment != null && ! clazzDef.packageFragment.elementName.empty)»package «clazzDef.packageFragment.elementName»;«ENDIF»
	
	import at.bestsolution.efxclipse.runtime.workbench3.FXViewPart;
	import javafx.scene.Scene;
	
	public class «clazzDef.name» extends FXViewPart {
	
		@Override
		protected Scene createFxScene() {
			return null;
		}
	
		@Override
		protected void setFxFocus() {
			
		}
	}
	'''
	
}
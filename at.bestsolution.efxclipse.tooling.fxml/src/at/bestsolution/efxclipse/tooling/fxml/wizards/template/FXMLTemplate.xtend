package at.bestsolution.efxclipse.tooling.fxml.wizards.template

import at.bestsolution.efxclipse.tooling.ui.wizards.template.IGenerator

class FXMLTemplate implements IGenerator<at.bestsolution.efxclipse.tooling.fxml.wizards.template.FXMLElement> { 
	override generateContent(at.bestsolution.efxclipse.tooling.fxml.wizards.template.FXMLElement element) '''
		<?xml version="1.0" encoding="UTF-8"?>
		
		<?import «element.rootElement.fullyQualifiedName»?>
		
		«IF element.fxRoot»<fx:root xmlns:fx="http://javafx.com/fxml" type="«element.rootElement.elementName»">«ELSE»<«element.rootElement.elementName» xmlns:fx="http://javafx.com/fxml">«ENDIF»
			<!-- TODO Add Nodes -->
		«IF element.fxRoot»</fx:root>«ELSE»</«element.rootElement.elementName»>«ENDIF»
		
	'''
}
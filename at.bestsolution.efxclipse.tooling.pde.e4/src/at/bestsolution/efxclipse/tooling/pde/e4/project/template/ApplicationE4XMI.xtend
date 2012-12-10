package at.bestsolution.efxclipse.tooling.pde.e4.project.template

import org.eclipse.emf.ecore.util.EcoreUtil

class ApplicationE4XMI {
		
	def generateContent(String rootContext) '''
<?xml version="1.0" encoding="UTF-8"?>
<application:Application 
	xmi:version="2.0" 
	xmlns:xmi="http://www.omg.org/XMI" 
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:advanced="http://www.eclipse.org/ui/2010/UIModel/application/ui/advanced" 
	xmlns:application="http://www.eclipse.org/ui/2010/UIModel/application" 
	xmlns:basic="http://www.eclipse.org/ui/2010/UIModel/application/ui/basic" 
	xmlns:menu="http://www.eclipse.org/ui/2010/UIModel/application/ui/menu" 
	xmi:id="«EcoreUtil::generateUUID»" 
	elementId="org.eclipse.e4.application" 
	bindingContexts="«rootContext»">
	
	<rootContext xmi:id="«rootContext»" elementId="org.eclipse.ui.contexts.dialogAndWindow" name="In Dialog and Windows">
		<children xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.ui.contexts.window" name="In Windows"/>
		<children xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.ui.contexts.dialog" name="In Dialogs"/>
	</rootContext>
	<addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.e4.core.commands.service" contributionURI="bundleclass://org.eclipse.e4.core.commands/org.eclipse.e4.core.commands.CommandServiceAddon"/>
	<addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.e4.ui.contexts.service" contributionURI="bundleclass://org.eclipse.e4.ui.services/org.eclipse.e4.ui.services.ContextServiceAddon"/>
	<addons xmi:id="«EcoreUtil::generateUUID»" elementId="at.bestsolution.efxclipse.runtime.bindings.e4.service" contributionURI="bundleclass://at.bestsolution.efxclipse.runtime.bindings.e4/at.bestsolution.efxclipse.runtime.bindings.e4.BindingServiceAddon"/>
	<addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.e4.ui.workbench.commands.model" contributionURI="bundleclass://org.eclipse.e4.ui.workbench/org.eclipse.e4.ui.internal.workbench.addons.CommandProcessingAddon"/>
	<addons xmi:id="«EcoreUtil::generateUUID»" elementId="org.eclipse.e4.ui.workbench.contexts.model" contributionURI="bundleclass://org.eclipse.e4.ui.workbench/org.eclipse.e4.ui.internal.workbench.addons.ContextProcessingAddon"/>
	<addons xmi:id="«EcoreUtil::generateUUID»" elementId="at.bestsolution.efxclipse.runtime.bindings.e4.model" contributionURI="bundleclass://at.bestsolution.efxclipse.runtime.bindings.e4/at.bestsolution.efxclipse.runtime.bindings.e4.BindingProcessingAddon"/>
</application:Application>
	'''

}
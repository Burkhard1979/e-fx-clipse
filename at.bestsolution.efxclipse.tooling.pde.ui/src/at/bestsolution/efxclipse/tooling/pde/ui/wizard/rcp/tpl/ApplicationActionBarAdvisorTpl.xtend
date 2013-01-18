package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl

import static extension at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util.*
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile
import java.util.Map
 
class ApplicationActionBarAdvisorTpl implements Generator<DynamicFile> {
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val packageName = file.cuPackagename;
		return generate(packageName).toStream
	}
	
	def generate(String packageName) '''package «packageName»;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

    public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
        super(configurer);
    }

    protected void makeActions(IWorkbenchWindow window) {
    }

    protected void fillMenuBar(IMenuManager menuBar) {
    }
    
}'''
}
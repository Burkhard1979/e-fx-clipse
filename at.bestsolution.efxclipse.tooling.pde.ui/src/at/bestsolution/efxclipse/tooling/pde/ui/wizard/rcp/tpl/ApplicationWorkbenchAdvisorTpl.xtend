package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile
import java.util.Map
import static extension at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util.*

class ApplicationWorkbenchAdvisorTpl implements Generator<DynamicFile> { 
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val packageName = file.cuPackagename;
		return generate(packageName).toStream
	}
	
	def generate(String packageName) '''package «packageName»;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	private static final String PERSPECTIVE_ID = "$pluginId$.perspective"; //$$NON-NLS-1$$

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}'''
}
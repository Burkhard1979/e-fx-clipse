package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile
import java.util.Map
import static extension at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util.*

class PerspectiveTpl implements Generator<DynamicFile> { 
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val packageName = file.cuPackagename;
		return generate(packageName).toStream
	}
	
	def generate(String packageName) '''package «packageName»;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import $packageName$.$viewPartClass$;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addStandaloneView($viewPartClass$.ID, false, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
	}
}
'''
}
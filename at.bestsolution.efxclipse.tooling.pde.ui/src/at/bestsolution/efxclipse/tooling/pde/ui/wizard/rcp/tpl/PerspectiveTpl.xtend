package at.bestsolution.efxclipse.tooling.pde.ui.wizard.rcp.tpl

import at.bestsolution.efxclipse.tooling.rrobot.model.task.Generator
import at.bestsolution.efxclipse.tooling.rrobot.model.task.DynamicFile
import java.util.Map
import static extension at.bestsolution.efxclipse.tooling.pde.ui.wizard.Util.*

class PerspectiveTpl implements Generator<DynamicFile> { 
	
	override generate(DynamicFile file, Map<String,Object> data) {
		val bundleId = file.getVariableValue("bundleId");
		val packageName = file.cuPackagename;
		return generate(bundleId, packageName).toStream
	}
	
	def generate(String bundleId, String packageName) '''package «packageName»;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import «bundleId».views.ViewPart;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addStandaloneView(ViewPart.ID, false, IPageLayout.LEFT, 1.0f, layout.getEditorArea());
	}
}
'''
}
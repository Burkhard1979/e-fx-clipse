package at.bestsolution.efxclipse.ecp.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MBasicFactory;
import org.eclipse.e4.ui.model.application.ui.basic.MInputPart;
import org.eclipse.e4.ui.model.application.ui.basic.MPartStack;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;

@SuppressWarnings("restriction")
public class OpenModelElementHandler {

	@Execute
	public void open(MApplication application, EModelService modelService, EPartService partService) {
		// Assuming that all editors should open in the the stack with the
		// ID "org.eclipse.e4.primaryDataStack"

		MPartStack stack = (MPartStack) modelService.find("at.bestsolution.efxclipse.ecp.app.partstacks.editors", application);

		MInputPart part = MBasicFactory.INSTANCE.createInputPart();
		// Pointing to the contributing class
		part.setContributionURI("bundleclass://at.bestsolution.efxclipse.ecp.app/at.bestsolution.efxclipse.ecp.ModelEditorPart");
		
//		part.setInputURI(input.getInputURI());
//		part.setIconURI("platform:/plugin/de.vogella.rcp.e4.todo/icons/sample.gif");
		part.setLabel("huhu");
//		part.setTooltip(input.getTooltip());
		part.setCloseable(true);
		stack.getChildren().add(part);
		partService.showPart(part, PartState.ACTIVATE);
	}

}

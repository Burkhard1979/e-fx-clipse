package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.contexts.RunAndTrack;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.internal.workbench.ContributionsAnalyzer;
import org.eclipse.e4.ui.model.application.MContribution;
import org.eclipse.e4.ui.model.application.commands.MParameter;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolItem;

@SuppressWarnings("restriction")
public abstract class BaseToolItemRenderer<N> extends BaseRenderer<MToolItem, WToolItem<N>> {

	@Override
	protected void initWidget(final MToolItem element, final WToolItem<N> widget) {
		super.initWidget(element, widget);
		
		final IEclipseContext modelContext = getModelContext(element);
		widget.setOnActionCallback(new Runnable() {
			
			@Override
			public void run() {
				executeAction(element,modelContext.getActiveLeaf());
			}
		});
		
		final IEclipseContext parentContext = getContextForParent(element); 
		parentContext.runAndTrack(new RunAndTrack() {
			
			@Override
			public boolean changed(IEclipseContext context) {
				canExecute(element, widget, parentContext.getActiveLeaf());
				return true;
			}
		});
	}
	
	private ParameterizedCommand generateParameterizedCommand(
			final MHandledItem item, final IEclipseContext lclContext) {
		ECommandService cmdService = (ECommandService) lclContext
				.get(ECommandService.class.getName());
		Map<String, Object> parameters = null;
		List<MParameter> modelParms = item.getParameters();
		if (modelParms != null && !modelParms.isEmpty()) {
			parameters = new HashMap<String, Object>();
			for (MParameter mParm : modelParms) {
				parameters.put(mParm.getName(), mParm.getValue());
			}
		}
		ParameterizedCommand cmd = cmdService.createCommand(item.getCommand()
				.getElementId(), parameters);
		return cmd;
	}
	
	protected void canExecute(MToolItem item, WToolItem<N> widget, IEclipseContext context) {
		if( item instanceof MContribution ) {
			MContribution contribution = (MContribution) item;
			Object object = getContributionObject(context, contribution);
			
			IEclipseContext runContext = context.createChild("DI-ToolItem");
			try {
				ContributionsAnalyzer.populateModelInterfaces(item, runContext, item.getClass().getInterfaces());
				runContext.set(MItem.class.getName(), item);
				widget.setHandled(Boolean.TRUE.equals(ContextInjectionFactory.invoke(object, CanExecute.class, context, Boolean.TRUE)));
			} finally {
				runContext.dispose();
			}
		}
	}
	
	protected void executeAction(MToolItem item, IEclipseContext context) {
		if( item instanceof MContribution ) {
			MContribution contribution = (MContribution) item;
			Object object = getContributionObject(context, contribution);
			
			IEclipseContext runContext = context.createChild("DI-ToolItem");
			try {
				ContributionsAnalyzer.populateModelInterfaces(item, runContext, item.getClass().getInterfaces());
				runContext.set(MItem.class.getName(), item);
				ContextInjectionFactory.invoke(object,Execute.class, runContext);
			} finally {
				runContext.dispose();	
			}
		} else if( item instanceof MHandledItem ) {
			MHandledItem handledItem = (MHandledItem) item;
			EHandlerService service = (EHandlerService) context.get(EHandlerService.class.getName());
			ParameterizedCommand cmd = handledItem.getWbCommand();
			if (cmd == null) {
				cmd = generateParameterizedCommand(handledItem, context);
				handledItem.setWbCommand(cmd);
			}
			if (cmd == null) {
				System.err.println("Failed to execute: " + handledItem.getCommand());
				return;
			}
			final IEclipseContext runContext = context.createChild("HI-ToolItem");
			try {
				ContributionsAnalyzer.populateModelInterfaces(item,runContext, item.getClass().getInterfaces());
				service.executeHandler(cmd, runContext);
			} finally {
				runContext.dispose();				
			}
		}
	}
	
	private Object getContributionObject(IEclipseContext context, MContribution contribution) {
		Object rv = contribution.getObject();
		if( rv == null ) {
			IContributionFactory cf = (IContributionFactory) context.get(IContributionFactory.class.getName());
			rv = cf.create(contribution.getContributionURI(), context);
			contribution.setObject(rv);
		}
		return rv;
	}
	
	@Override
	public void doProcessContent(MToolItem element) {
		if( element.getMenu() != null ) {
			engineCreateWidget(element.getMenu());
		}
	}

	@Override
	public void childRendered(MToolItem parentElement, MUIElement element) {
		
	}
	
	@Override
	public void hideChild(MToolItem container, MUIElement changedObj) {
		
	}

}

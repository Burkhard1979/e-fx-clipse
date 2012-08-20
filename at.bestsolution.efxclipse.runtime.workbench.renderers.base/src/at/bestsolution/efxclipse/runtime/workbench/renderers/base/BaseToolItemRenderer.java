package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.e4.core.commands.ECommandService;
import org.eclipse.e4.core.commands.EHandlerService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.contributions.IContributionFactory;
import org.eclipse.e4.ui.di.UISynchronize;
import org.eclipse.e4.ui.internal.workbench.ContributionsAnalyzer;
import org.eclipse.e4.ui.model.application.MContribution;
import org.eclipse.e4.ui.model.application.commands.MParameter;
import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.menu.MHandledItem;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.model.application.ui.menu.MToolItem;

import at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget.WToolItem;

@SuppressWarnings("restriction")
public abstract class BaseToolItemRenderer<N> extends BaseRenderer<MToolItem, WToolItem<N>> implements ToolElementEnabledCheck<MToolItem> {
	@Inject
	UISynchronize sync;
	
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
	}
	
	@Override
	public void checkEnablement(final MToolItem toolbarElement) {
		@SuppressWarnings("unchecked")
		final WToolItem<N> widget = (WToolItem<N>) toolbarElement.getWidget();

		// can we call canExecute in the none ui thread????
		sync.syncExec(new Runnable() {
			
			@Override
			public void run() {
				try {
					widget.setHandled(canExecute(toolbarElement, getRenderingContext(toolbarElement)));	
				} catch(Throwable t) {
					//TODO Log it
					t.printStackTrace();
				}
				
			}
		});
		
	}
	
	private ParameterizedCommand generateParameterizedCommand(
			final MHandledItem item, final IEclipseContext lclContext) {
		if( item.getCommand() == null ) {
			System.err.println("No command assigned to " + item);
			return null;
		}
		
		if( item.getCommand().getElementId() == null || item.getCommand().getElementId().trim().isEmpty() ) {
			System.err.println("No command id assigned to " + item.getCommand().getElementId());
			return null;
		}
		
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
	
	protected boolean canExecute(MToolItem item, IEclipseContext context) {
		if( item instanceof MContribution ) {
			MContribution contribution = (MContribution) item;
			Object object = getContributionObject(context, contribution);
			if( object == null ) {
				return false;
			}
			
			IEclipseContext runContext = context.createChild("DI-ToolItem");
			try {
				ContributionsAnalyzer.populateModelInterfaces(item, runContext, item.getClass().getInterfaces());
				runContext.set(MItem.class.getName(), item);
				return Boolean.TRUE.equals(ContextInjectionFactory.invoke(object, CanExecute.class, context, Boolean.TRUE));
			} finally {
				runContext.dispose();
			}
		} else if( item instanceof MHandledItem ) {
			MHandledItem handledItem = (MHandledItem) item;
			EHandlerService service = (EHandlerService) context.get(EHandlerService.class.getName());
			if( service == null ) {
				return false;
			}
			
			ParameterizedCommand cmd = handledItem.getWbCommand();
			if (cmd == null) {
				cmd = generateParameterizedCommand(handledItem, context);
				handledItem.setWbCommand(cmd);
			}
			if (cmd == null) {
				return false;
			}
			
			final IEclipseContext runContext = context.createChild("HI-ToolItem");
			try {
				ContributionsAnalyzer.populateModelInterfaces(item,runContext, item.getClass().getInterfaces());
				return service.canExecute(cmd, runContext);
			} finally {
				runContext.dispose();				
			}
		}
		
		return false;
	}
	
	protected void executeAction(MToolItem item, IEclipseContext context) {
		if( item instanceof MContribution ) {
			MContribution contribution = (MContribution) item;
			Object object = getContributionObject(context, contribution);
			if( object == null ) {
				return;
			}
			
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
			if( contribution.getContributionURI() == null ) {
				System.err.println("No contribution uri defined");
				return null;
			}
			
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

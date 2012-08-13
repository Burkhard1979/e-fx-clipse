package at.bestsolution.efxclipse.runtime.workbench.renderers.base;

import java.util.Collection;

import javafx.scene.image.Image;

import org.eclipse.e4.ui.model.application.ui.MUIElement;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MTrimmedWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;
import org.eclipse.e4.ui.workbench.IResourceUtilities;
import org.eclipse.e4.ui.workbench.modeling.ISaveHandler;
import org.eclipse.e4.ui.workbench.modeling.ISaveHandler.Save;

import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WLayoutedWidget;
import at.bestsolution.efxclipse.runtime.workbench.renderers.widgets.WWindow;

@SuppressWarnings("restriction")
public abstract class BaseWindowRenderer<N> extends BaseRenderer<MWindow,WWindow<N>> {

	@Override
	protected void initWidget(final MWindow element, final WWindow<N> widget) {
		getModelContext(element).set(ISaveHandler.class, new ISaveHandler() {
			
			@Override
			public Save[] promptToSave(Collection<MPart> dirtyParts) {
				@SuppressWarnings("unchecked")
				IResourceUtilities<Image> resourceUtilities = getModelContext(element).get(IResourceUtilities.class);
				return BaseWindowRenderer.this.promptToSave(resourceUtilities, dirtyParts, widget);
			}
			
			@Override
			public Save promptToSave(MPart dirtyPart) {
				@SuppressWarnings("unchecked")
				IResourceUtilities<Image> resourceUtilities = getModelContext(element).get(IResourceUtilities.class);
				return BaseWindowRenderer.this.promptToSave(resourceUtilities, dirtyPart, widget);
//				Collection<MPart> c = Collections.singleton(dirtyPart);
//				return BaseWindowRenderer.this.promptToSave(resourceUtilities,c, widget)[0];
			}
		});
	}
	
	protected abstract Save[] promptToSave(IResourceUtilities<Image> resourceUtilities, Collection<MPart> dirtyParts, WWindow<N> widget);
	protected abstract Save promptToSave(IResourceUtilities<Image> resourceUtilities, MPart dirtyPart, WWindow<N> widget);

	@Override
	public void doProcessContent(MWindow element) {
		WWindow<N> windowWidget = getWidget(element);
		
		if (element.getMainMenu() != null) {
			WLayoutedWidget<MMenu> menuWidget = engineCreateWidget(element.getMainMenu());
			if( menuWidget != null ) {
				windowWidget.setMainMenu(menuWidget);	
			}
		}
		
		if( element instanceof MTrimmedWindow ) {
			for( MTrimBar tm : ((MTrimmedWindow)element).getTrimBars() ) {
				WLayoutedWidget<MTrimBar> trimWidget = engineCreateWidget(tm);
				if( trimWidget != null ) {
					trimWidget.addStyleClasses(tm.getSide().name());
					switch (tm.getSide()) {
					case TOP:
						windowWidget.setTopTrim(trimWidget);
						break;
					case RIGHT:
						windowWidget.setRightTrim(trimWidget);
						break;
					case BOTTOM:
						windowWidget.setBottomTrim(trimWidget);
						break;
					case LEFT:
						windowWidget.setLeftTrim(trimWidget);
						break;
					default:
						break;
					}					
				}
			}
		}
		
		for( MWindowElement e : element.getChildren() ) {
			WLayoutedWidget<MWindowElement> widget = engineCreateWidget(e);
			if( widget != null ) {
				windowWidget.addChild(widget);
			}
		}
	}

	@Override
	public void postProcess(MWindow element) {
		super.postProcess(element);
		if( element.isVisible() ) {
			WWindow<N> window = getWidget(element);
			if( window != null ) {
				window.show();
			}
		}
	}

	@Override
	public void childRendered(MWindow parentElement, MUIElement element) {
	}
	
	@Override
	public void hideChild(MWindow container, MUIElement changedObj) {
	}
}

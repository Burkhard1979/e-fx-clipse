package at.bestsolution.efxclipse.runtime.workbench.renderers.widgets;

import org.eclipse.e4.ui.model.application.ui.basic.MTrimBar;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.model.application.ui.menu.MMenu;

@SuppressWarnings("restriction")
public interface WWindow<N> extends WWidget<MWindow> {
	
	public void setMainMenu(WLayoutedWidget<MMenu> menuWidget);
	public void setTopTrim(WLayoutedWidget<MTrimBar> trimBar);
	public void setLeftTrim(WLayoutedWidget<MTrimBar> trimBar);
	public void setRightTrim(WLayoutedWidget<MTrimBar> trimBar);
	public void setBottomTrim(WLayoutedWidget<MTrimBar> trimBar);
	
	public void addChild(WLayoutedWidget<MWindowElement> widget);
	
	public void show(); 
}

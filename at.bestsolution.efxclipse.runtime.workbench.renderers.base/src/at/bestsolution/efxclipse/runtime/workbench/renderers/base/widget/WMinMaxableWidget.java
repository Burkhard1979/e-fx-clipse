package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;


public interface WMinMaxableWidget {
	public enum WMinMaxState {
		NONE,
		MINIMIZED,
		MAXIMIZED,
		RESTORED
	}
	
	public void setMinMaxCallback(WCallback<WMinMaxState, Void> minMaxCallback);

	public void setMinMaxState(WMinMaxState state);
}

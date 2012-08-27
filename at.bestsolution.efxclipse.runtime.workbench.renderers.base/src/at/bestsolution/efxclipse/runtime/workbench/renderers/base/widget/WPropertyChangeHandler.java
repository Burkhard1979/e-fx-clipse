package at.bestsolution.efxclipse.runtime.workbench.renderers.base.widget;

public interface WPropertyChangeHandler<W extends WWidget<?>> {
	public static class WPropertyChangeEvent<W extends WWidget<?>> {
		public final String propertyname;
		public final W widget;
		public final Object newValue;
		
		public WPropertyChangeEvent(W widget, String propertyname, Object newValue) {
			this.widget = widget;
			this.propertyname = propertyname;
			this.newValue = newValue;
		}
	}
	
	public void propertyObjectChanged(WPropertyChangeEvent<W> event);
}

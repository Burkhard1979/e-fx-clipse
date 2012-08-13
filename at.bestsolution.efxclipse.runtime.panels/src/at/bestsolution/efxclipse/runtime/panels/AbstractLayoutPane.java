package at.bestsolution.efxclipse.runtime.panels;

import java.util.WeakHashMap;

import javafx.scene.Node;
import javafx.scene.layout.Pane;

public abstract class AbstractLayoutPane<D> extends Pane {
	public static final int FX_DEFAULT = -1;
	public static final int FX_BEGINNING = 1;
	public static final int FX_FILL = 4;
	public static final int FX_LEFT = 16384;
	public static final int FX_END = 16777224;
	public static final int FX_RIGHT = 131072;
	public static final int FX_CENTER = 16777216;
	public static final int FX_BOTTOM = 1024;
	public static final int FX_TOP = 128;
	public static final int FX_HORIZONTAL = 256;
	
	static class Size {
		public final double width;
		public final double height;
		
		public Size(double width, double height) {
			this.width = width;
			this.height = height;
		}
	}
	
	protected abstract Size computeSize(double width, double height, boolean flushCache);
	
	@Override
	protected double computeMaxHeight(double width) {
		return computeSize(Double.MAX_VALUE, Double.MAX_VALUE, true).height;
	}
	
	@Override
	protected double computeMaxWidth(double height) {
		return computeSize(Double.MAX_VALUE, Double.MAX_VALUE, true).width;
	}
	
	@Override
	protected double computeMinHeight(double width) {
		return 0;
	}
	
	@Override
	protected double computeMinWidth(double height) {
		return 0;
	}
	
	@Override
	protected double computePrefHeight(double width) {
		return computeSize(FX_DEFAULT, FX_DEFAULT, true).height;
	}
	
	@Override
	protected double computePrefWidth(double height) {
		return computeSize(FX_DEFAULT, FX_DEFAULT, true).width;
	}
}

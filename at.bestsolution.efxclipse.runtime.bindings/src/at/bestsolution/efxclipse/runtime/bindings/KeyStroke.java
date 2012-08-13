package at.bestsolution.efxclipse.runtime.bindings;

public interface KeyStroke extends Trigger {

	boolean hasAltModifier();

	boolean hasCtrlModifier();

	boolean hasShiftModifier();

	boolean hasCommandModifier(); 

}

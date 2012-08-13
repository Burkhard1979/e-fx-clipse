package at.bestsolution.efxclipse.runtime.bindings;


public interface TriggerSequence {

	Trigger[] getTriggers();

	TriggerSequence[] getPrefixes();

	String format();

	boolean isEmpty();

}

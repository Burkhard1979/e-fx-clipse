package at.bestsolution.efxclipse.runtime.bindings;

public interface KeySequence extends TriggerSequence, Comparable<KeySequence> {

	KeyStroke[] getKeyStrokes();

}

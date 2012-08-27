package at.bestsolution.efxclipse.runtime.bindings.service;

import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.Binding;
import at.bestsolution.efxclipse.runtime.bindings.KeyLookup;
import at.bestsolution.efxclipse.runtime.bindings.KeySequence;
import at.bestsolution.efxclipse.runtime.bindings.KeyStroke;
import at.bestsolution.efxclipse.runtime.bindings.ParseException;
import at.bestsolution.efxclipse.runtime.bindings.TriggerSequence;

public interface BindingFactory {

	KeySequence getKeySequenceInstance(KeyLookup keylookup, String sequence) throws ParseException;

	KeySequence getKeySequenceInstance();
	
	KeySequence getKeySequenceInstance(KeySequence keySequence, KeyStroke stroke);
	
	Binding createKeyBinding(TriggerSequence sequence, ParameterizedCommand command, String schemeId, String contextId);

	KeyStroke getKeyStrokeInstance(KeyLookup lookup, int modifierKeys, int naturalKey);	
}

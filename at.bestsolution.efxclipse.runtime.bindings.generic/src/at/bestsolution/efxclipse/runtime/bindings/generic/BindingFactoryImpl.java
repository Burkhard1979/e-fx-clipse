package at.bestsolution.efxclipse.runtime.bindings.generic;

import java.util.List;

import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.Binding;
import at.bestsolution.efxclipse.runtime.bindings.KeyLookup;
import at.bestsolution.efxclipse.runtime.bindings.KeySequence;
import at.bestsolution.efxclipse.runtime.bindings.KeyStroke;
import at.bestsolution.efxclipse.runtime.bindings.ParseException;
import at.bestsolution.efxclipse.runtime.bindings.TriggerSequence;
import at.bestsolution.efxclipse.runtime.bindings.service.BindingFactory;

public class BindingFactoryImpl implements BindingFactory {

	@Override
	public KeySequence getKeySequenceInstance(KeyLookup keylookup, String sequence) throws ParseException {
		return KeySequenceImpl.getInstance(keylookup, sequence);
	}

	@Override
	public Binding createKeyBinding(TriggerSequence sequence, ParameterizedCommand command, String schemeId, String contextId) {
		return new KeyBindingImpl((KeySequence) sequence, command, schemeId, contextId);
	}

	@Override
	public KeySequence getKeySequenceInstance(KeySequence keySequence, KeyStroke stroke) {
		return KeySequenceImpl.getInstance(keySequence, stroke);
	}
	
	@Override
	public KeySequence getKeySequenceInstance() {
		return KeySequenceImpl.getInstance();
	}
	
	@Override
	public KeyStroke getKeyStrokeInstance(KeyLookup lookup, int modifierKeys, int naturalKey) {
		return KeyStrokeImpl.getInstance(lookup, modifierKeys, naturalKey);
	}

}

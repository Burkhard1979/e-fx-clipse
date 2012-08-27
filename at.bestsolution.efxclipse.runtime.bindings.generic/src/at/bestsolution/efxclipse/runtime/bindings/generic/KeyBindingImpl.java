package at.bestsolution.efxclipse.runtime.bindings.generic;

import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.KeySequence;
import at.bestsolution.efxclipse.runtime.bindings.TriggerSequence;

public class KeyBindingImpl extends BindingImpl {
	private final KeySequence keySequence;
	
	public KeyBindingImpl(final KeySequence keySequence, ParameterizedCommand command, String schemeId, String contextId) {
		super(command, schemeId, contextId);
		this.keySequence = keySequence;
	}

	@Override
	public TriggerSequence getTriggerSequence() {
		return keySequence;
	}

}

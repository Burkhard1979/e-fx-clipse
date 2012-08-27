package at.bestsolution.efxclipse.runtime.bindings;

import org.eclipse.core.commands.ParameterizedCommand;

public interface Binding {

	int SYSTEM = 0;
	int USER = 1;

	String getSchemeId();

	TriggerSequence getTriggerSequence();

	ParameterizedCommand getParameterizedCommand();

	String getContextId();
}

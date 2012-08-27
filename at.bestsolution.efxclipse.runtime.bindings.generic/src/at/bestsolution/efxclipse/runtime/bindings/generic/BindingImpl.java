package at.bestsolution.efxclipse.runtime.bindings.generic;

import org.eclipse.core.commands.ParameterizedCommand;

import at.bestsolution.efxclipse.runtime.bindings.Binding;

public abstract class BindingImpl implements Binding {
	/**
	 * The parameterized command to which this binding applies. This value may
	 * be <code>null</code> if this binding is meant to "unbind" an existing
	 * binding.
	 */
	private final ParameterizedCommand command;

	/**
	 * The context identifier to which this binding applies. This context must
	 * be active before this key binding becomes active. This value will never
	 * be <code>null</code>.
	 */
	private final String contextId;
	
	/**
	 * The identifier of the scheme in which this binding applies. This value
	 * will never be <code>null</code>.
	 */
	private final String schemeId;
	
	public BindingImpl(ParameterizedCommand command, String schemeId, String contextId) {
		this.command = command;
		this.schemeId = schemeId;
		this.contextId = contextId;
	}
	
	@Override
	public String getContextId() {
		return contextId;
	}
	
	@Override
	public ParameterizedCommand getParameterizedCommand() {
		return command;
	}
	
	@Override
	public String getSchemeId() {
		return schemeId;
	}
}

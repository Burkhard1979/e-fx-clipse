/*******************************************************************************
 * Copyright (c) 2012 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
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

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
package at.bestsolution.efxclipse.tooling.ui.editor;

import java.util.List;

public interface IValueOfContributor {
	public interface Proposal {
		public String getValue();
	}
	
	public interface DialogProposal extends Proposal {
		public String openDialogValue();
	}

	public static class SimpleValueProposal implements Proposal {
		private final String value;

		public SimpleValueProposal(String value) {
			this.value = value;
		}
		
		@Override
		public String getValue() {
			return value;
		}
	}

	public List<Proposal> getProposals();

	public String getType();
}

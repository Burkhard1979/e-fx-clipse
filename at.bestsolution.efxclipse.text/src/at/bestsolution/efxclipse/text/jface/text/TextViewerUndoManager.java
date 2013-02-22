/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.text.jface.text;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import org.eclipse.core.commands.operations.IUndoContext;
import org.eclipse.text.undo.DocumentUndoManager;
import org.eclipse.text.undo.IDocumentUndoManager;


/**
 * Implementation of {@link org.eclipse.jface.text.IUndoManager} using the shared
 * document undo manager.
 * <p>
 * It registers with the connected text viewer as text input listener, and obtains
 * its undo manager from the current document.  It also monitors mouse and keyboard
 * activities in order to partition the stream of text changes into undo-able
 * edit commands.
 * <p>
 * This class is not intended to be subclassed.
 * </p>
 *
 * @see ITextViewer
 * @see ITextInputListener
 * @see IDocumentUndoManager
 * @see MouseListener
 * @see KeyListener
 * @see DocumentUndoManager
 *
 * @since 3.2
 * @noextend This class is not intended to be subclassed by clients.
 */
public class TextViewerUndoManager implements IUndoManager, IUndoManagerExtension {

	public TextViewerUndoManager(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public IUndoContext getUndoContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void connect(ITextViewer viewer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beginCompoundChange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endCompoundChange() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMaximalUndoLevel(int undoLevel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean undoable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean redoable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redo() {
		// TODO Auto-generated method stub
		
	}

}

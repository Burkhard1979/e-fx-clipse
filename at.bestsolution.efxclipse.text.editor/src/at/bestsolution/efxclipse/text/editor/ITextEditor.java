package at.bestsolution.efxclipse.text.editor;

import org.eclipse.core.runtime.IAdaptable;

public interface ITextEditor extends IAdaptable {

	IDocumentProvider getDocumentProvider();

	IEditorInput getEditorInput();

	boolean isEditable();

}

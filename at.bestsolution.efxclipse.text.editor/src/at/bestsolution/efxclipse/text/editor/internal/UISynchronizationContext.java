package at.bestsolution.efxclipse.text.editor.internal;

import javafx.application.Platform;

import org.eclipse.core.filebuffers.ISynchronizationContext;

/**
 * Synchronization context for file buffers whose documents are shown in the UI.
 * The synchronization runnable is executed in the UI thread.
 *
 * @since 3.0
 */
public class UISynchronizationContext implements ISynchronizationContext {

	/*
	 * @see org.eclipse.core.filebuffers.ISynchronizationContext#run(java.lang.Runnable)
	 */
	public void run(Runnable runnable) {
		if( Platform.isFxApplicationThread() ) {
			runnable.run();
		} else {
			Platform.runLater(runnable);
		}
	}
}

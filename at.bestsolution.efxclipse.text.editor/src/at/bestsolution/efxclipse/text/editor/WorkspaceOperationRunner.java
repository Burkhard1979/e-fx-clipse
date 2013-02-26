package at.bestsolution.efxclipse.text.editor;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.jobs.ISchedulingRule;

import org.eclipse.core.resources.ResourcesPlugin;

/**
 * @since 3.0
 */
public class WorkspaceOperationRunner implements IRunnableContext {

	private IProgressMonitor fProgressMonitor;

	public WorkspaceOperationRunner() {
	}

	/**
	 * Sets the progress monitor.
	 *
	 * @param progressMonitor the progress monitor to set
	 */
	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		fProgressMonitor= progressMonitor;
	}

	/**
	 * Returns the progress monitor. It there is no progress monitor the monitor\
	 * is set to the <code>NullProgressMonitor</code>.
	 *
	 * @return the progress monitor
	 */
	public IProgressMonitor getProgressMonitor() {
		if (fProgressMonitor == null)
			fProgressMonitor= new NullProgressMonitor();
		return fProgressMonitor;
	}

	/*
	 * @see org.eclipse.jface.operation.IRunnableContext#run(boolean, boolean, org.eclipse.jface.operation.IRunnableWithProgress)
	 */
	public void run(boolean fork, boolean cancelable, IRunnableWithProgress runnable) throws InvocationTargetException, InterruptedException {
		if (runnable instanceof ISchedulingRuleProvider)
			run(runnable, ((ISchedulingRuleProvider)runnable).getSchedulingRule());
		else
			run(runnable, ResourcesPlugin.getWorkspace().getRoot());
	}

	/*
	 * @see org.eclipse.jface.operation.IRunnableContext#run(boolean, boolean, org.eclipse.jface.operation.IRunnableWithProgress)
	 */
	private void run(IRunnableWithProgress runnable, ISchedulingRule schedulingRule) throws InvocationTargetException, InterruptedException {
		WorkspaceModifyDelegatingOperation operation= new WorkspaceModifyDelegatingOperation(runnable, schedulingRule);
		operation.run(getProgressMonitor());
	}
}

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
package at.bestsolution.efxclipse.tooling.rrobot.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;

import at.bestsolution.efxclipse.tooling.rrobot.ProjectHandler;
import at.bestsolution.efxclipse.tooling.rrobot.RRobot;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.Project;
import at.bestsolution.efxclipse.tooling.rrobot.model.task.RobotTask;

public class RRobotImpl implements RRobot {
	private List<ProjectHandler<Project>> handlers = new ArrayList<ProjectHandler<Project>>();

	public void addProjectHandler(ProjectHandler<Project> handler) {
		synchronized (handlers) {
			handlers.add(handler);
		}
	}

	public void removeProjectHandler(ProjectHandler<Project> handler) {
		synchronized (handlers) {
			handlers.remove(handler);
		}
	}

	@Override
	public IStatus executeTask(IProgressMonitor monitor, RobotTask task, Map<String, Object> additionalData) {
		List<ProjectHandler<Project>> handlers;
		
		synchronized (this.handlers) {
			handlers = new ArrayList<ProjectHandler<Project>>(this.handlers);	
		}
		
		List<IStatus> states = new ArrayList<IStatus>();
		for( Project p : task.getProjects() ) {
			for( ProjectHandler<Project> handler : handlers ) {
				if( handler.isHandled(p.eClass()) ) {
					states.add(handler.createProject(monitor, p, additionalData));
				}
			}	
		}
		
		return new MultiStatus("at.bestsolution.efxclipse.tooling.rrobot", 0, states.toArray(new IStatus[0]), "Task executed", null);
	}

}

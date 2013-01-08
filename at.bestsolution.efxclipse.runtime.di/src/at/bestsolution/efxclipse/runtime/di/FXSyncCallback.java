/*******************************************************************************
 * Copyright (c) 2013 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl<tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.di;

import javafx.application.Platform;
import at.bestsolution.efxclipse.runtime.core.Callback;

public abstract class FXSyncCallback<T> implements Callback<T> {
	
	public static <T> FXSyncCallback<T> onFX(final Callback<T> callback) {
		if( callback instanceof FXSyncCallback<?> ) {
			return (FXSyncCallback<T>) callback;
		}
		return new FXSyncCallback<T>() {

			@Override
			public void call(final T value) {
				if( Platform.isFxApplicationThread() ) {
					callback.call(value);
				} else {
					Platform.runLater(new Runnable() {
						
						@Override
						public void run() {
							callback.call(value);
						}
					});
				}
			}
		};
	}
}

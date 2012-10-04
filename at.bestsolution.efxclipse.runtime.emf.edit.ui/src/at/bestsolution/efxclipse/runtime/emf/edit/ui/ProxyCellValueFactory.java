/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package at.bestsolution.efxclipse.runtime.emf.edit.ui;

import javafx.beans.value.ObservableValue;
import javafx.beans.value.ObservableValueBase;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.util.Callback;

/**
 *	A cell value factory that simply forwards {@link CellDataFeatures#getValue()} as an {@link ObservableValue}. 
 */
public class ProxyCellValueFactory implements Callback<TableColumn.CellDataFeatures<Object, Object>, ObservableValue<Object>> {

	@Override
	public ObservableValue<Object> call(final CellDataFeatures<Object, Object> features) {

		//TODO add notifications on update
	
		return new ObservableValueBase<Object>() {

			@Override
			public Object getValue() {
				return features.getValue();
			}

		};

	}

}
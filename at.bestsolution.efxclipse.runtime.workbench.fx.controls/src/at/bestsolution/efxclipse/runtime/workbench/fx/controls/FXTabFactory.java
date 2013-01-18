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
package at.bestsolution.efxclipse.runtime.workbench.fx.controls;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import at.bestsolution.efxclipse.runtime.controls.fx2.FX2Tab;
import at.bestsolution.efxclipse.runtime.controls.fx2.FX2TabPane;
import at.bestsolution.efxclipse.runtime.controls.fx2.FX2TabPaneSkin;
import at.bestsolution.efxclipse.runtime.controls.fx8.FX8Tab;
import at.bestsolution.efxclipse.runtime.controls.fx8.FX8TabPane;
import at.bestsolution.efxclipse.runtime.core.Util;

public class FXTabFactory {
	public static Tab createTab() {
		if( Util.isFX2() ) {
			return new FX2Tab();
		} else {
			return new FX8Tab();
		}
	}
	
	public static TabPane createTabPane() {
		if( Util.isFX2() ) {
			FX2TabPane tab = new FX2TabPane();
			tab.setSkin(new FX2TabPaneSkin(tab));
			return  tab;
		} else {
			FX8TabPane tab = new FX8TabPane();
			return tab;
		}
	}
}

/*
 * Copyright (c) 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package at.bestsolution.efxclipse.runtime.controls.fx8;

import javafx.beans.DefaultProperty;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Tab;
import javafx.util.Callback;
import at.bestsolution.efxclipse.runtime.controls.FXTab;

@DefaultProperty("content")
public class FX8Tab extends Tab implements FXTab {
	private Callback<Tab, Boolean> closeVetoHandler;

	public FX8Tab() {
		setOnCloseRequest(new EventHandler<Event>() {
			
			@Override
			public void handle(Event event) {
				if( closeVetoHandler != null && closeVetoHandler.call(FX8Tab.this) ) {
					event.consume();
				}
			}
		});
	}
	
	public Callback<Tab, Boolean> getCloseVetoHandler() {
		return closeVetoHandler;
	}

	@Override
	public void setCloseVetoHandler(Callback<Tab, Boolean> closeVetoHandler) {
		this.closeVetoHandler = closeVetoHandler;
	}
}
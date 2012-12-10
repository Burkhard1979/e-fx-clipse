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
package at.bestsolution.efxclipse.demo.twitter.ui.views;

import javafx.beans.property.adapter.JavaBeanStringPropertyBuilder;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;

import at.bestsolution.efxclipse.demo.twitter.core.services.FollowerService;
import at.bestsolution.efxclipse.demo.twitter.model.Follower;

@SuppressWarnings("restriction")
public class FollowerList {
	@Inject
	FollowerService followerService;
	
	private TableView<Follower> tableView;
	
	@PostConstruct
	void init(BorderPane parent) {
		tableView = new TableView<>();
		
		{
			TableColumn<Follower,String> t = new TableColumn<>("Username");
			t.setMinWidth(200);
			t.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Follower,String>, ObservableValue<String>>() {
				
				@Override
				public ObservableValue<String> call(CellDataFeatures<Follower, String> param) {
					try {
						return JavaBeanStringPropertyBuilder.create().bean(param.getValue()).name("name").build();
					} catch (NoSuchMethodException e) {
						e.printStackTrace();
						return null;
					}
				}
			});
			tableView.getColumns().add(t);
		}
		
		{
			TableColumn<Follower,String> t = new TableColumn<>("Language");
			t.setMinWidth(200);
			t.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Follower,String>, ObservableValue<String>>() {
				
				@Override
				public ObservableValue<String> call(CellDataFeatures<Follower, String> param) {
					try {
						return JavaBeanStringPropertyBuilder.create().bean(param.getValue()).name("language").build();
					} catch (NoSuchMethodException e) {
						e.printStackTrace();
						return null;
					}
				}
			});
			tableView.getColumns().add(t);
		}
		
		tableView.setItems(FXCollections.observableArrayList(followerService.findAllFollowers()));
		
		parent.setCenter(tableView);
	}
	
	@Focus
	void setFocus() {
		tableView.requestFocus();
	}
}

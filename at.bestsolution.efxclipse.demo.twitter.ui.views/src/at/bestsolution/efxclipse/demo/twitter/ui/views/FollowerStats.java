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

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.eclipse.e4.ui.di.Focus;

import at.bestsolution.efxclipse.demo.twitter.core.services.FollowerService;
import at.bestsolution.efxclipse.demo.twitter.model.Follower;

@SuppressWarnings("restriction")
public class FollowerStats {

	private PieChart chart;
	
	@Inject
	FollowerService followerService;
	
	@PostConstruct
	void init(BorderPane p) {
		Map<String, Integer> map = new HashMap<>();
		
		for( Follower f : followerService.findAllFollowers() ) {
			Integer i = map.get(f.getLanguage());
			if( i == null ) {
				i = new Integer(0);
			}
			i = i+1;
			map.put(f.getLanguage(), i);
		}
		
		ObservableList<PieChart.Data> list = FXCollections.observableArrayList();
		for( Entry<String, Integer> e : map.entrySet() ) {
			list.add(new PieChart.Data(e.getKey(), e.getValue()));
		}
		
		chart = new PieChart(list);
		p.setCenter(chart);
	}
	
	@Focus
	void setFocus() {
		chart.requestFocus();
	}
}

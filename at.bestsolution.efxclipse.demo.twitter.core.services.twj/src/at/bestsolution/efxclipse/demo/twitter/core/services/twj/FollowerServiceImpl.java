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
package at.bestsolution.efxclipse.demo.twitter.core.services.twj;

import java.util.ArrayList;
import java.util.List;

import twitter4j.PagableResponseList;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import at.bestsolution.efxclipse.demo.twitter.core.services.FollowerService;
import at.bestsolution.efxclipse.demo.twitter.model.Follower;

public class FollowerServiceImpl implements FollowerService {
	private Twitter twitter;

	public FollowerServiceImpl() {
		twitter = new TwitterFactory().getInstance();
	}
	
	@Override
	public List<Follower> findAllFollowers() {
		List<Follower> rv = new ArrayList<>();
		try {
			PagableResponseList<User> users;
			long cursor = -1;
			do {
				users = twitter.getFriendsList("tomsontom", cursor);
				for( User user : users ) {
					Follower f = new Follower();
					f.setLanguage(user.getLang());
					f.setName(user.getScreenName());
					rv.add(f);
				}
			} while ((cursor = users.getNextCursor()) != 0);
			
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rv;
	}
	
	public static void main(String[] args) {
		new FollowerServiceImpl().findAllFollowers();
	}
}

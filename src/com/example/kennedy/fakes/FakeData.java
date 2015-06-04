package com.example.kennedy.fakes;

import java.util.ArrayList;
import java.util.Date;

import com.example.kennedy.model.Event;
import com.example.kennedy.model.User;
import com.example.kennedy.model.JSONConverter;

public class FakeData {
	
	private String events;
	private String users;
	
	public FakeData() {
		createUsers(5);
		createEvents(10);
	}
	
	public String getEvents() {
		return events;
	}

	public String getUsers() {
		return users;
	}

	private String createUsers(int num) {
		ArrayList<User> users = new ArrayList<User>();
		JSONConverter converter = new JSONConverter();
		User u;
		
		for (int i = 0; i < num; i++) {
			u = new User();
			u.setUserID(i);
			u.setUsername("User " + i);
			u.setPhoneNumber("1234567890");
			u.setCode("BFDS68U9DSJF90F7DS67FD8Y7");
			u.setBalance(40.00);
			u.setTotalPurchased(50.00);
			users.add(u);
		}
		return converter.usersToJSON(users);
	}
	
	private String createEvents(int num) {
		ArrayList<Event> events = new ArrayList<Event>();
		JSONConverter converter = new JSONConverter();
		Event e;
		Date d = new Date();
		
		for (int i = 0; i < num; i++) {
			e = new Event();
			e.setEventID(i);
			e.setEventName("Event " + i);
			e.setEventDescription("Description for event " + i);
			e.setCreatedBy(0);
			e.setEventDate(d);
			e.setCreatedOn(d);
			e.setBettingCloseDate(d);
			events.add(e);
		}
		return converter.eventsToJSON(events);
	}
	
}

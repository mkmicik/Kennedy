package com.example.kennedy.proxy;

import java.util.ArrayList;

import com.example.kennedy.dao.ServerAccess;
import com.example.kennedy.model.Event;
import com.example.kennedy.model.JSONConverter;
import com.example.kennedy.model.User;

public class DataAccessProxy {

	public ArrayList<Event> getEvents() {
		ServerAccess dao = ServerAccess.getInstance();
		JSONConverter converter = new JSONConverter();
		String json = dao.getEvents();
		return converter.eventsFromJSON(json);
	}
	
	public ArrayList<User> getUsers() {
		ServerAccess dao = ServerAccess.getInstance();
		JSONConverter converter = new JSONConverter();
		String json = dao.getUsers();
		return converter.usersFromJSON(json);
	}
}

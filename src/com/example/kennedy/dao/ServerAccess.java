package com.example.kennedy.dao;

import com.example.kennedy.fakes.*;

public class ServerAccess {

	private static ServerAccess instance;
	private FakeData f;
	
	private ServerAccess() {
		f = new FakeData();
	}
	
	public static ServerAccess getInstance() {
		if (instance == null) {
			instance = new ServerAccess();
		}
		return instance;
	}
	
	public String getEvents() {
		return f.getEvents();
	}
	
	public String getUsers() {
		return f.getUsers(); 
	}
	
}

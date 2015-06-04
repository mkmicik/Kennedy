package com.example.kennedy.dao;

import java.util.Date;

import com.example.kennedy.enums.DataType;
import com.example.kennedy.fakes.FakeData;

public class LocalAccess {

	private static LocalAccess instance;
	private FakeData f;
	
	private LocalAccess() {
		f = new FakeData();
	}
	
	public static LocalAccess getInstance() {
		if (instance == null) {
			instance = new LocalAccess();
		}
		return instance;
	}
	
	public Date checkDataFreshness(DataType dt) {
		return new Date();
	}
	
	public String getEvents() {
		return f.getEvents();
	}
	
	public String getUsers() {
		return f.getUsers(); 
	}
}

package com.example.kennedy.model;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONConverter {

	public String eventsToJSON(ArrayList<Event> events) {
		Gson gson = new Gson();
		return gson.toJson(events);
	}
	
	public ArrayList<Event> eventsFromJSON(String json) {
		Gson gson = new Gson();
		Type listType = new TypeToken<List<Event>>(){}.getType();
		return gson.fromJson(json, listType);
	}
	
	public String usersToJSON(ArrayList<User> users) {
		Gson gson = new Gson();
		return gson.toJson(users);
	}
	
	public ArrayList<User> usersFromJSON(String json) {
		Gson gson = new Gson();
		Type listType = new TypeToken<List<User>>(){}.getType();
		return gson.fromJson(json, listType);
	}
	
}

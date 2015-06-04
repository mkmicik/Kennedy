package com.example.kennedy.model;

import java.util.Date;

public class Event {
	private int EventID;
	private String EventName;	
	private String EventDescription; 
	private Date EventDate; 
	private Date BettingCloseDate;
	private int CreatedBy;
	private Date CreatedOn;
	
	public int getEventID() {
		return EventID;
	}
	public void setEventID(int eventID) {
		EventID = eventID;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public String getEventDescription() {
		return EventDescription;
	}
	public void setEventDescription(String eventDescription) {
		EventDescription = eventDescription;
	}
	public Date getEventDate() {
		return EventDate;
	}
	public void setEventDate(Date eventDate) {
		EventDate = eventDate;
	}
	public Date getBettingCloseDate() {
		return BettingCloseDate;
	}
	public void setBettingCloseDate(Date bettingCloseDate) {
		BettingCloseDate = bettingCloseDate;
	}
	public int getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(int createdBy) {
		CreatedBy = createdBy;
	}
	public Date getCreatedOn() {
		return CreatedOn;
	}
	public void setCreatedOn(Date createdOn) {
		CreatedOn = createdOn;
	} 
	
	
}

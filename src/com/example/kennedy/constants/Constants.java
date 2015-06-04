package com.example.kennedy.constants;

public class Constants {
	
	// Numeric Constants
	public static final int MAX_EVENT_FRESHNESS = 300;
	public static final int MAX_USER_FRESHNESS = 600;
	
	//Database
	public static final String DATABASE_NAME = "Ledger";
	public static final int DATABASE_VERSION = 1;
	
	// Tables
    public static final String TBL_EVENTS = "tbl_events";
    public static final String TBL_USERS = "tbl_users";
 
    // Columns
    public static final String TABLE_EVENTS_COL_ID = " id";
    public static final String TABLE_EVENTS_COL_NAME = " name";
    public static final String TABLE_EVENTS_COL_DESCR = " description";
    public static final String TABLE_EVENTS_COL_DATE = " date";
    public static final String TABLE_EVENTS_COL_CLOSEDATE = " close_date";
    public static final String TABLE_EVENTS_COL_CREATEDBY = " created_by";
    public static final String TABLE_EVENTS_COL_CREATEDON = " created_on";
 
    public static final String TABLE_USERS_COL_ID = " id";
    public static final String TABLE_USERS_COL_CODE = " code";
    public static final String TABLE_USERS_COL_USERNAME = " username";
    public static final String TABLE_USERS_COL_PHONENUMBER = " phone_number";
    public static final String TABLE_USERS_COL_BALANCE = " balance";
    public static final String TABLE_USERS_COL_TOTAL_PURCHASED = " total_purchased";
	
}

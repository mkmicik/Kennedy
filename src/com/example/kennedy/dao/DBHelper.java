package com.example.kennedy.dao;

import com.example.kennedy.model.Event;
import com.example.kennedy.model.User;
import com.example.kennedy.constants.Constants;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, Constants.DATABASE_NAME, null, Constatns.DATABASE_VERSION);
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
    	String CREATE_EVENTS_TABLE = "CREATE TABLE " + TABLE_EVENTS + " ( "
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_PH_NO + " TEXT" + ")";
    	String CREATE_USERS_TABLE = "CREATE TABLE " + TABLE_USERS + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT,"
                + KEY_PH_NO + " TEXT" + ")";
    	
        db.execSQL(CREATE_EVENTS_TABLE);
        db.execSQL(CREATE_USERS_TABLE);
    }
 
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EVENTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        // Create tables again
        onCreate(db);
    }
    
    public void addEvent(Event e) {
        SQLiteDatabase db = this.getWritableDatabase();
     
        ContentValues values = new ContentValues();
        values.put(KEY_NAME, e.getEventName());
        values.put(KEY_PH_NO, contact.getPhoneNumber()); // Contact Phone Number
     
        // Inserting Row
        db.insert(TABLE_EVENTS, null, values);
        db.close(); // Closing database connection
    }
}
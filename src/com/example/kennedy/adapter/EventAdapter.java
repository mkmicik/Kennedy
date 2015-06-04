package com.example.kennedy.adapter;

import java.util.ArrayList;

import com.example.kennedy.R;
import com.example.kennedy.model.Event;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class EventAdapter extends BaseAdapter {

	private ArrayList<Event> events;
	private Context c;
	private LayoutInflater layoutInflater;

	public EventAdapter (ArrayList<Event> events, Context c) {
		this.events = events;
		this.c = c;
	}

	@Override
	public int getCount() {
		return events.size();
	}

	@Override
	public Object getItem(int position) {
		return events.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = null;

		LayoutInflater inflater = (LayoutInflater) ((Activity) c).getLayoutInflater();
		row = inflater.inflate(R.layout.listitem_event, parent, false);

		/*
		TextView event_name = (TextView)row.findViewById(R.id.drink1);
		TextView event_description = (TextView)row.findViewById(R.id.price11);
		TextView event_datetime = (TextView)row.findViewById(R.id.price12);
		TextView event_close_datetime = (TextView)row.findViewById(R.id.price21);
		TextView current_pot = (TextView)row.findViewById(R.id.price22);
		TextView created_by = (TextView)row.findViewById(R.id.drink2);

		event_name.setText(events.get(position).getEventName());
		event_description.setText(events.get(position).getEventName());
		event_datetime.setText(events.get(position).getEventName());
		event_close_datetime.setText(events.get(position).getEventName());
		current_pot.setText(events.get(position).getEventName());
		created_by.setText(events.get(position).getEventName());
		*/
		return row;
	}

}

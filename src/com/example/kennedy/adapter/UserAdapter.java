package com.example.kennedy.adapter;

import java.util.ArrayList;

import com.example.kennedy.R;
import com.example.kennedy.model.User;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class UserAdapter extends BaseAdapter {

	private ArrayList<User> users;
	private Context c;
	private LayoutInflater layoutInflater;

	public UserAdapter (ArrayList<User> users, Context c) {
		this.users = users;
		this.c = c;
	}

	@Override
	public int getCount() {
		return users.size();
	}

	@Override
	public Object getItem(int position) {
		return users.get(position);
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
		TextView user_name = (TextView)row.findViewById(R.id.drink1);
		TextView user_status = (TextView)row.findViewById(R.id.price11);

		user_name.setText(users.get(position).getUsername());
		user_status.setText(users.get(position).getUserStatus());
		*/
		return row;
	}

}

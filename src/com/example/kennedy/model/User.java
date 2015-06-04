package com.example.kennedy.model;

public class User {

	private int UserID;
	private String Code;
	private String Username;
	private String PhoneNumber;
	private double Balance;
	private double TotalPurchased;
	
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public double getTotalPurchased() {
		return TotalPurchased;
	}
	public void setTotalPurchased(double totalPurchased) {
		TotalPurchased = totalPurchased;
	}
	
	
}

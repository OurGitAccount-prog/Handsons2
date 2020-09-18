package com.ece;

public class Address {

	int userId;
	String street;
	String city;
	String state;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void display() {

		System.out.println(getUserId() + "   " + getStreet() + "      " + getCity() + "   " + getState());

	}

}

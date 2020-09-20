package com.chan;

public class User implements Comparable<User> {

	String name;
	String mobileNumber;
	String username;
	String password;

	User(String name, String mobileNumber, String username, String password) {
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.username = username;
		this.password = password;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int compareTo(User u) {
		return this.getName().compareTo(u.getName());
	}

	public String toString() {
		return "name" + " " + "mobileNumber" + " " + "username" + " " + "password";
	}
}

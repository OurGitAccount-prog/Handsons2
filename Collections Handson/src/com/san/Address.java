package com.san;

public class Address implements Comparable<Address> {

	String username;
	String addressLine1;
	String addressLine2;
	Long pinCode;

	public Address() {

	}

	public Address(String username, String addressLine1, String addressLine2, Long pinCode) {

		this.username = username;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.pinCode = pinCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Long getPinCode() {
		return pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}

	public int compareTo(Address a) {
		return this.getPinCode().compareTo(a.getPinCode());
	}

	public String toString() {
		return username + "" + addressLine1 + "" + addressLine2 + "" + pinCode;
	}

}

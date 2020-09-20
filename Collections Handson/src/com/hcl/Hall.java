package com.hcl;

public class Hall implements Comparable<Hall> {

	String name;
	String contactNumber;
	Double costPerDay;
	String ownerName;

	public Hall() {

	}

	public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {

		this.name = name;
		this.contactNumber = contactNumber;
		this.costPerDay = costPerDay;
		this.ownerName = ownerName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Double getCostPerDay() {
		return costPerDay;
	}

	public void setCostPerDay(Double costPerDay) {
		this.costPerDay = costPerDay;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int compareTo(Hall h) {

		return this.getCostPerDay().compareTo(h.getCostPerDay());
	}

	public String toString() {
		return name + "  " + contactNumber + "  " + costPerDay + "  " + ownerName;
	}

}
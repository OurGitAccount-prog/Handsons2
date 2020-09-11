package com.myhcl;

public class Event {

	protected String name;
	protected String details;
	protected String ownername;

	public Event() {

	}

	public Event(String name, String details, String ownername) {

		this.name = name;
		this.details = details;
		this.ownername = ownername;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getOwnername() {
		return this.ownername;
	}

	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}

	public Double projectedRevenue() {
		return 0.0;
	}

}

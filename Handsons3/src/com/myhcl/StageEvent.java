package com.myhcl;

public class StageEvent extends Event {

	Double noOfseats;
	Double noOfSeatsPerShow;

	public StageEvent(Double noOfseats, Double noOfSeatsPerShow) {

		this.noOfseats = noOfseats;
		this.noOfSeatsPerShow = noOfSeatsPerShow;

	}

	public Double projectedRevenue() {
		return (this.noOfSeatsPerShow * this.noOfseats * 50);
	}
}

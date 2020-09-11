package com.myhcl;

public class Exhibition extends Event {

	Double noOfstall;

	public Exhibition(Double noOfstall) {

		this.noOfstall = noOfstall;

	}

	public Double projectedRevenue() {

		return (this.noOfstall * 10000);

	}

}

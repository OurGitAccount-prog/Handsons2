package com.myhcl;

public class ExecutiveStall implements Stall {

	String stallName;
	int cost;
	String ownerName;
	int screen;

	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getScreen() {
		return screen;
	}

	public void setScreen(int screen) {
		this.screen = screen;
	}

	public void display() {
		System.out.println("Stall name=" + getStallName());
		System.out.println("cost of stall=" + getCost());
		System.out.println("owner name=" + getOwnerName());
		System.out.println("num of screen=" + getScreen());

	}
}

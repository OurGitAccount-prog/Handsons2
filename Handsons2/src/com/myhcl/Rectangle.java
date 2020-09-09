package com.myhcl;

public class Rectangle extends Circle {
	Double length;
	Double breadth;

	public void computeArea(Double length, Double breadth) {
		Double area = length * breadth;
		System.out.println("Area of Rectangle=" + area);
		length = area;
		breadth = area;
	}
}
package com.myhcl;

public class Circle extends Shape {

	Double radius;

	public void computeArea(Double radius) {
		Double area = ((22 / 7) * radius * radius);
		System.out.println("Area of Circle=" + area);
		radius = area;

	}

}
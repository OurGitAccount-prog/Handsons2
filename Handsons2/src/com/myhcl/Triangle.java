package com.myhcl;

public class Triangle extends Rectangle {
	Double base;
	Double height;

	public void computeArea(Double base, Double height) {
		Double area = ((0.5) * (base * height));
		System.out.println("Area of Triangle =" + area);
		base = area;
		height = area;
	}

}

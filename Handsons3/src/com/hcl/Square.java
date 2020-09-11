package com.hcl;

public class Square extends Shape {
	double sides;

	public Double calculatePerimeter() {
		Double perimeter = 4 * sides;
		return perimeter;
	}

	public double getSides() {
		return sides;
	}

	public void setSides(double sides) {
		this.sides = sides;
	}

}

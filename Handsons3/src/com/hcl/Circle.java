package com.hcl;

class Circle extends Shape {

	Double radius;

	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double calculatePerimeter() {
		Double perimeter = 2 * (22 / 7) * this.radius;
		return perimeter;

	}

}

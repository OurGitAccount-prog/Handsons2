package com.hcl;

public class Rectangle extends Shape {
	Double length;
	Double breadth;

	public Double calculatePerimeter() {
		Double perimeter = 2 * (this.length + this.breadth);
		return perimeter;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getBreadth() {
		return breadth;
	}

	public void setBreadth(Double breadth) {
		this.breadth = breadth;
	}

}

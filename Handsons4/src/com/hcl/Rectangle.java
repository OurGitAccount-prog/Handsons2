package com.hcl;

public class Rectangle {

	Double length;
	Double breadth;

	Double calcPeri() {
		Double perimeter = 2 * (length + breadth);
		return perimeter;
	}

	Double calcArea() {
		Double area = length * breadth;
		return area;
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

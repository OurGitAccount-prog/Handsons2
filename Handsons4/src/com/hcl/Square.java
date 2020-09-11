package com.hcl;

public class Square implements Polygon {
	public Square(Double sides) {
		super();
		this.sides = sides;
	}

	Double sides;

	public Double calcPeri() {
		Double perimeter = 4 * sides;
		return perimeter;
	}

	public Double calcArea() {
		Double area = sides * sides;
		return area;

	}
}

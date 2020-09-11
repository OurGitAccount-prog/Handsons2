package com.hcl;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and breadth");
		Double length = sc.nextDouble();
		Double breadth = sc.nextDouble();
		System.out.println("enter sides");
		Double sides = sc.nextDouble();
		Rectangle r = new Rectangle();
		r.setLength(length);
		r.setBreadth(breadth);
		System.out.println("perimeter of rectangle=" + r.calcPeri());
		System.out.println("area of rectangle=" + r.calcArea());
		Square s = new Square(sides);
		System.out.println("perimeter of square=" + s.calcPeri());
		System.out.println("Area of square=" + s.calcArea());
	}

}

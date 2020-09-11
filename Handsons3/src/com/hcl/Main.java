package com.hcl;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("List of shape");
		System.out.println("1)Circle");
		System.out.println("2)Rectangle");
		System.out.println("3)Square");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 1) {
			System.out.println("Enter radius=");
			Double radius = sc.nextDouble();
			Circle c = new Circle(radius);
			Double circlePm = c.calculatePerimeter();
			System.out.println("Perimeter of circle: " + circlePm);
		} else if (i == 2) {
			System.out.println("Enter length=");
			Double length = sc.nextDouble();
			System.out.println("Enter breadth=");
			Double breadth = sc.nextDouble();
			Rectangle r = new Rectangle();
			r.setLength(length);
			r.setBreadth(breadth);
			System.out.println("perimeter of rectangle" + r.calculatePerimeter());
		} else if (i == 3) {
			System.out.println("Enter base=");
			Double sides = sc.nextDouble();
			Square s = new Square();
			s.setSides(sides);
			System.out.println("perimeter of rectangle" + s.calculatePerimeter());

		}
	}

}

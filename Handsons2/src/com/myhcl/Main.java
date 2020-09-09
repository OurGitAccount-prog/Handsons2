package com.myhcl;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape");
		System.out.println("1.circle");
		System.out.println("2.rectangle");
		System.out.println("3.triangle");
		int x = sc.nextInt();
		if (x == 1) {
			System.out.println("Enter radius=");
			Double radius = sc.nextDouble();
			c.computeArea(radius);

		}
		if (x == 2) {
			System.out.println("Enter length=");
			Double length = sc.nextDouble();
			System.out.println("Enter breadth=");
			Double breadth = sc.nextDouble();
			r.computeArea(length, breadth);
		}
		if (x == 3) {
			System.out.println("Enter base=");
			Double base = sc.nextDouble();
			System.out.println("Enter height=");
			Double heigth = sc.nextDouble();
			t.computeArea(base, heigth);
		}
		if (x == 4) {
			System.out.println("Invalid Choice");
		}
	}

}

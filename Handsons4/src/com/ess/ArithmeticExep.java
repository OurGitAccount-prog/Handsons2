package com.ess;

import java.io.IOException;
import java.util.Scanner;

public class ArithmeticExep {

	public static void main(String[] args) throws IOException {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter Divisor :");
		int num = sc.nextInt();
		System.out.println("Enter any 10 values :");
		for (i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		try {
			for (i = 0; i < 10; i++) {
				System.out.println("Result : " + a[i] / num);
			}
		} catch (ArithmeticException e) {
			System.out.println("Can not divide by zero");
		}

	}

}

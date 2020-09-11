package com.ess;

import java.io.IOException;
import java.util.Scanner;

public class IllrgalArgExcept {

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

		for (i = 0; i < 10; i++) {
			try {
				if (((a[i] % 2 == 0) && (num % 2 == 0)) || ((a[i] % 2 == 1) && (num % 2 == 1))) {
					System.out.println("Result : " + a[i] / num);
				} else {
					throw new IllegalArgumentException("");
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Exception handled in the method");
				continue;
			}
		}
	}

}

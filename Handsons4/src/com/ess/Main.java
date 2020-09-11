package com.ess;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int[] a = new int[10];
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the details:");
		for (i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		int j = 0, k = 0, m = 10;
		try {
			while (j == 0) {
				System.out.println("Division Result : " + a[k] / m);
				k = k + 1;
				m = m - 1;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Elements Over");
		}

	}
}

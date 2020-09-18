package com.esr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the users:");
		int n = sc.nextInt();
		System.out.println("Enter the item details:");
		String s1 = br.readLine();
		StringBuilder sb = new StringBuilder(s1);

		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			String[] res = str.split("$");
			String m = res[0];
			String j = res[1];
			int l = Integer.parseInt(res[2]);
			int b = Integer.parseInt(res[3]);
			Item it = new Item(m, j, l, b);
		}
		if (s1.contains(0)) {
			System.out.println(this.name + "," + this.type + "," + this.cost + "," + "not available");
		}
	}
}
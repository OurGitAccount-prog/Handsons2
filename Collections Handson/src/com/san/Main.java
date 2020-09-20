package com.san;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users:");
		int n = sc.nextInt();
		System.out.println("Enter user address");

		ArrayList<Address> al = new ArrayList<Address>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			String[] res = str.split(",");
			String m = res[0];
			String j = res[1];
			String k = res[2];
			Long l = Long.parseLong(res[3]);
			al.add(new Address(m, j, k, l));

		}
		Collections.sort(al);
		for (Address ad : al) {
			System.out.println(ad);
		}
	}
}

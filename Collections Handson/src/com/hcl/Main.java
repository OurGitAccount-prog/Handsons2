package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of hall details");
		int n = sc.nextInt();
		ArrayList<Hall> al = new ArrayList<Hall>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the hall " + i + " details");
			String str = br.readLine();
			String[] res = str.split(",");
			String m = res[0];
			String j = res[1];
			Double k = Double.parseDouble(res[2]);
			String l = res[3];
			al.add(new Hall(m, j, k, l));

		}
		Collections.sort(al);
		System.out.println("Name " + "" + " Contactnumber" + " " + "Costperday" + " " + "Owner name");

		for (Hall s : al) {

			System.out.println(s);

		}
	}
}

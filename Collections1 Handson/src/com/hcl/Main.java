package com.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of halls");
		int i = sc.nextInt();
		System.out.println("Enter the hall name 1:");
		String str = br.readLine();
		System.out.println("Enter the hall name 2:");
		String str1 = br.readLine();
		System.out.println("Enter the hall name 3:");

		String str2 = br.readLine();
		System.out.println("enter the hall name to be search:");
		String str3 = br.readLine();
		ArrayList<String> al = new ArrayList<>();
		al.add(str);
		al.add(str1);
		al.add(str2);
		for (String value : al) {

		}
		int pos = al.indexOf(str3);
		if (al.contains(str3)) {
			System.out.println(str3 + "  hall is found in list at position  " + pos);
		} else
			System.out.println(str3 + "  hall is not found");
	}
}

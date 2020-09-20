package org.ess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter user name:");
		String str = br.readLine();

		System.out.println("Do you want to continue");
		String str1 = br.readLine();
		System.out.println("Enter user name:");
		String str2 = br.readLine();
		System.out.println("Do you want to continue");
		String str3 = br.readLine();
		System.out.println("Enter user name:");
		String str4 = br.readLine();

		System.out.println("Do you want to continue");
		String str5 = br.readLine();
		System.out.println("Enter user name:");
		String str6 = br.readLine();

		System.out.println("Do you want to continue");
		String str7 = br.readLine();
		Set<String> s = new HashSet<>();
		s.add(str);
		s.add(str2);
		s.add(str4);
		s.add(str6);
		for (String i : s) {

		}
		int size = s.size();
		System.out.println("The unique number of username is  " + size);

	}
}

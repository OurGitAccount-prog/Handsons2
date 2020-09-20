package org.ece;

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
		System.out.println("Do you want to continue(y/n)");
		String str1 = br.readLine();
		System.out.println("Enter user name:");

		System.out.println("Do you want to continue(y/n)");
		String str3 = br.readLine();
		System.out.println("Enter user name:");
		String str4 = br.readLine();
		System.out.println("Do you want to continue(y/n)");
		String str5 = br.readLine();
		System.out.println("Enter user name:");

		System.out.println("Do you want to continue(y/n)");
		String str7 = br.readLine();
		System.out.println("Enter user name:");
		String str8 = br.readLine();
		System.out.println("Do you want to continue(y/n)");
		String str9 = br.readLine();

		Set<String> s = new HashSet<>();
		s.add(str);

		s.add(str4);

		s.add(str8);
		for (String i : s) {

		}
		int size = s.size();
		System.out.println("The unique number of username is  " + size);

	}
}

package org.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter user name 1:");
		String str = br.readLine();
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do u want to continue(y/n)");
		String str1 = br.readLine();
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter user name 2:");
		String str2 = br.readLine();
		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do u want to continue(y/n)");
		String str3 = br3.readLine();
		ArrayList<String> al = new ArrayList<>();
		al.add(str);
		al.add(str2);
		System.out.println("Enter the user name:");
		// Iterator itr=al.iterator();
		for (String i : al) {
			System.out.println(i);
		}
	}

}

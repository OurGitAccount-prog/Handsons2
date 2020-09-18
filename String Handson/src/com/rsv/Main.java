package com.rsv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st address:");
		String str = br.readLine();
		String[] res = str.split(",");
		System.out.println("Enter 2nd address:");
		String str1 = br.readLine();
		String[] res1 = str1.split(",");
		if (str.equals(str1)) {
			System.out.println("RED");
		} else if (str.equalToIgnoringWhiteSpace(str1)) {
			System.out.println("YELLOW");
		} else if (str.equalsIgnoreCase(str1)) {
			System.out.println("BLUE");
		} else
			System.out.println("GREEN");
	}
}

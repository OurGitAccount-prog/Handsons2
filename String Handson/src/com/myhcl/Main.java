package com.myhcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Humpty Sentence=");
		String str = br.readLine();
		System.out.println("Enter Dumpty Sentence=");
		String str1 = br.readLine();
		if (str.contains(str1)) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

	}
}

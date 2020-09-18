package com.rse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Humpty Sentence=");
		String str = br.readLine();
		if (str.equals(str.toUpperCase())) {
			System.out.println("String is in Uppercase");
		} else {
			System.out.println("String is not in Uppercase");
		}
	}

}

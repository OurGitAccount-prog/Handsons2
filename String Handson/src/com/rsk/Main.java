package com.rsk;

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
		if (str.checkwords().equals(str1.checkWords())) {
			System.out.println("Both have used equal number of words");
		} else if (str.checkwords() > str1.checkwords()) {
			System.out.println("Humpty has more words");
		} else {
			System.out.println("Dumpty has more words");
		}
	}
}
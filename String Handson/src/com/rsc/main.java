package com.rsc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Humpty Sentence=");
		String str = br.readLine();

		System.out.println(str.toUpperCase());

	}

}

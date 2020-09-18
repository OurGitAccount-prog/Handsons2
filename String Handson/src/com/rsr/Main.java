package com.rsr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the date:");
		String str = br.readLine();
		String[] res = str.split("/");
		int a = Integer.parseInt(res[0]);
		int a1 = Integer.parseInt(res[1]);
		int a2 = Integer.parseInt(res[2]);
		System.out.println("Date in correct format:");
		System.out.println(a + "-" + a1 + "-" + a2);
	}
}

package com.rss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Humpty's sentence:");
		String s = br.readLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Humpty says:" + sb);
		System.out.println("What Dumpty want to insert & where?");

		String s1 = br.readLine();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter postion:");
		int s2 = sc.nextInt();

		System.out.println("Humpty's new sentence:" + sb.insert(s2, s1));

	}

}

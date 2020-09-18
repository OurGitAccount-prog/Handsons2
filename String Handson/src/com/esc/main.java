package com.esc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Humpty Sentence=");
		String str = br.readLine();

		StringBuffer sb = new StringBuffer(str);

		System.out.println("word to replace =");
		String str1 = br.readLine();
		System.out.println("synonymn=");
		String str2 = br.readLine();

		System.out.println("Replaced String=" + sb.replace(11, 19, str2));
	}

}

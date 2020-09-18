package com.rsm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	static String convert(String s) {

		int cnt = 0;
		int n = s.length();
		char ch[] = s.toCharArray();
		int res_ind = 0;

		for (int i = 0; i < n; i++) {

			if (ch[i] == ' ') {
				cnt++;
				ch[i + 1] = Character.toUpperCase(ch[i + 1]);
				continue;

			} else
				ch[res_ind++] = ch[i];
		}

		return String.valueOf(ch, 0, n - cnt);
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the event name");
		String str = br.readLine();
		System.out.println("Enter the event in camel case=" + convert(str));
	}
}

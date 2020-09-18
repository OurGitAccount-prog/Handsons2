package com.rsp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuffer sb = new StringBuffer(s);
		System.out.println("Dumpty says:" + sb);
		System.out.println("what humpty sentence to remove ?");
		String str = br.readLine();
		System.out.println(sb.delete(10, 15));

	}
}
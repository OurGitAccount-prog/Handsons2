package com.chan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stall details");
		int n = sc.nextInt();
		TreeMap<String, String> m = new TreeMap<String, String>(Collections.reverseOrder());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the stall " + i + " details");
			String str = br.readLine();
			String[] res = str.split(",");
			String m1 = res[0];
			String j = res[1];
			String k = res[2];
			String l = res[3];
			m.put(m1, j);

		}
		System.out.println("The user details in reverse order:");
		System.out.println("Name" + "  " + "Mobile number");

		Iterator itr = m.keySet().iterator();
		while (itr.hasNext()) {
			String key = (String) itr.next();
			System.out.println(key + "      " + m.get(key));
		}

	}

}

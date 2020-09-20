package org.myhcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of stall details");
		int n = sc.nextInt();
		ArrayList<Stall> al = new ArrayList<Stall>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i <= n; i++) {
			System.out.println("Enter the stall " + i + " details");
			String str = br.readLine();
			String[] res = str.split(",");
			String m = res[0];
			String j = res[1];
			String k = res[2];
			String l = res[3];
			al.add(new Stall(m, j, k, l));
		}

		Iterator<Stall> itr = al.iterator();
		while (itr.hasNext()) {
			Stall stl = itr.next();
			if (stl.getName().contains("test")) {
				itr.remove();
			}
		}

		System.out.println("\nThe ArrayList elements are as follows: ");
		// System.out.printf("Name %-15s Details %-20s Type %-15s OwnerName");
		for (Stall s : al) {
			System.out.printf("%-15s %-20s %-15s %s\n", s.getName(), s.getDetail(), s.getType(), s.getOwnerName());
		}
	}
}

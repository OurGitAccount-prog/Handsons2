package org.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Customer=");
		int n = sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the details:");
		String str = br.readLine();
		String[] res = str.split(",");
		String n0 = res[0];
		Long r = Long.parseLong(res[1]);
		String str1 = br.readLine();
		String[] res1 = str1.split(",");
		String n1 = res1[0];
		Long r1 = Long.parseLong(res1[1]);
		String str2 = br.readLine();
		String[] res2 = str2.split(",");
		String n2 = res2[0];
		Long r2 = Long.parseLong(res2[1]);
		String str3 = br.readLine();
		String[] res3 = str3.split(",");
		String n3 = res3[0];
		Long r3 = Long.parseLong(res3[1]);

		ArrayList<TicketBooking> al = new ArrayList<TicketBooking>();
		al.add(new TicketBooking(n0, r));
		al.add(new TicketBooking(n1, r1));
		al.add(new TicketBooking(n2, r2));
		al.add(new TicketBooking(n3, r3));

		TicketBooking minPrice = Collections.min(al);
		System.out.println(minPrice.getCustomerName() + " spends minimum amount of Rs." + minPrice.getPrice());

		TicketBooking maxPrice = Collections.max(al);
		System.out.println(maxPrice.getCustomerName() + " spends maximum amount of Rs." + maxPrice.getPrice());

	}
}

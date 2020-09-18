package com.ece;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("enter number of users=");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("enter address details");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		String[] res = str.split(",");
		Integer t = Integer.parseInt(res[0]);
		String b = res[1];
		String v = res[2];
		String s = res[3];
		Address a = new Address();
		a.setUserId(t);
		a.setStreet(b);
		a.setCity(v);
		a.setState(s);
		a.getUserId();
		a.getStreet();
		a.getCity();
		a.getState();

		String str1 = br.readLine();
		String[] res1 = str1.split(",");
		Integer t1 = Integer.parseInt(res[0]);
		String b1 = res[1];
		String v1 = res[2];
		String s1 = res[3];
		Address a1 = new Address();
		a1.setUserId(t1);
		a1.setStreet(b1);
		a1.setCity(v1);
		a1.setState(s1);
		a1.getUserId();
		a1.getStreet();
		a1.getCity();
		a1.getState();
		String str2 = br.readLine();
		String[] res2 = str2.split(",");
		Integer t2 = Integer.parseInt(res[0]);
		String b2 = res[1];
		String v2 = res[2];
		String s2 = res[3];
		Address a2 = new Address();
		a2.setUserId(t2);
		a2.setStreet(b2);
		a2.setCity(v2);
		a2.setState(s2);
		a2.getUserId();
		a2.getStreet();
		a2.getCity();
		a2.getState();
		String str3 = br.readLine();
		String[] res3 = str3.split(",");
		Integer t3 = Integer.parseInt(res[0]);
		String b3 = res[1];
		String v3 = res[2];
		String s3 = res[3];
		Address a3 = new Address();
		a3.setUserId(t3);
		a3.setStreet(b3);
		a3.setCity(v3);
		a3.setState(s3);
		a3.getUserId();
		a3.getStreet();
		a3.getCity();
		a3.getState();
		System.out.println("User ID" + "Street    " + "City     " + "State");
		a.display();
		a1.display();
		a2.display();
		a3.display();
	}

}

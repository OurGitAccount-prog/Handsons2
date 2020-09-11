package com.myhcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		GoldStall g = new GoldStall();
		PremiumStall p = new PremiumStall();
		ExecutiveStall e = new ExecutiveStall();

		System.out.println("enter stall type:");
		System.out.println("1)gold stall");
		System.out.println("2)premiun stall");
		System.out.println("executive stall");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i == 1) {

			String str;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the details:");
			str = br.readLine();

			String[] res = str.split(",");
			String n = res[0];
			Integer r = Integer.parseInt(res[1]);
			String s = res[2];
			Integer t = Integer.parseInt(res[3]);

			g.setStallName(n);
			g.setCost(r);
			g.setOwnerName(s);
			g.setTvSet(t);
			g.getStallName();
			g.getCost();
			g.getOwnerName();
			g.getTvSet();
			g.display();
		} else if (i == 2) {
			String str1;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the details:");
			str1 = br.readLine();

			String[] res1 = str1.split(",");
			String n1 = res1[0];
			Integer r1 = Integer.parseInt(res1[1]);
			String s1 = res1[2];
			Integer t1 = Integer.parseInt(res1[3]);

			p.setStallName(n1);
			p.setCost(r1);
			p.setOwnerName(s1);
			p.getProjector();
			p.getStallName();
			p.getCost();
			p.getOwnerName();
			p.getProjector();
			p.display();
		} else if (i == 3) {

			String str3;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the details:");
			str3 = br.readLine();

			String[] res2 = str3.split(",");
			String n3 = res2[0];
			Integer r3 = Integer.parseInt(res2[1]);
			String s3 = res2[2];
			Integer t3 = Integer.parseInt(res2[3]);

			e.setStallName(n3);
			e.setCost(r3);
			e.setOwnerName(s3);
			e.setScreen(t3);
			e.getStallName();
			e.getCost();
			e.getOwnerName();
			e.getScreen();
			e.display();

		}

	}
}

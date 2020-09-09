package com.hcl;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		String accName;
		String accNo;
		String bankName;
		String tinNumber;
		String orgName;
		CurrentAccount c = new CurrentAccount();
		SavingsAccount s = new SavingsAccount();
		System.out.println("choose account type:");
		System.out.println("saving account");
		System.out.println("current account:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x == 1) {
			s.setAccName("Morsh");
			s.setAccNo("033808020000879");
			s.setBankName("baroda");
			s.setOrgName("Amphisoft");
			s.getAccName();
			s.getAccNo();
			s.getBankName();
			s.getOrgName();
			s.display2();

		}
		if (x == 2) {
			c.setAccName("Krish");
			c.setAccNo("131231451");
			c.setBankName("ICICI");
			c.setTinNumber("798902");
			c.getAccName();
			c.getAccNo();
			c.getBankName();
			c.getTinNumber();
			c.display1();

		}
	}

}

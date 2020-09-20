package org.myhcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		ItemType item = new ItemType();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the details of Item Type 1");

		System.out.println("Name:");
		String str1 = br.readLine();
		Scanner sc = new Scanner(System.in);
		System.out.println("Deposit:");
		Double str2 = sc.nextDouble();

		System.out.println("Cost per Day:");
		Double str3 = sc.nextDouble();
		System.out.println("Do you want to continue?(y/n)");
		String str4 = br.readLine();
		System.out.println("Enter the details of Item Type 2:");

		System.out.println("Name:");
		String str6 = br.readLine();

		System.out.println("Deposit:");
		Double str7 = sc.nextDouble();

		System.out.println("Cost per Day:");
		Double str8 = sc.nextDouble();
		System.out.println("Do you want to continue?(y/n)");
		String str9 = br.readLine();

		ArrayList<ItemType> it = new ArrayList<>();
		it.add(new ItemType(str1, str2, str3));
		item.setName(str1);
		item.setDeposit(str2);
		item.setCostPerDay(str3);
		item.getName();
		item.getDeposit();
		item.getCostPerDay();
		it.add(new ItemType(str6, str7, str8));
		item.setName(str6);
		item.setDeposit(str7);
		item.setCostPerDay(str8);
		item.getName();
		item.getDeposit();
		item.getCostPerDay();

		System.out.println("Name  " + "Deposit  " + "CostPerDay");
		it.forEach(ItemType -> System.out
				.println(item.getName() + "   " + item.getDeposit() + "   " + item.getCostPerDay()));

	}

}

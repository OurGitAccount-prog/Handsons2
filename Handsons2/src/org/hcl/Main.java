package org.hcl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] arg) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the account details:");
		String str = br.readLine();
		String[] res = str.split(",");
		String a = res[0];
		Double b = Double.parseDouble(res[1]);
		String c = res[2];
		Double d = Double.parseDouble(res[3]);
		int e = Integer.parseInt(res[4]);
		FixedAccount fa = new FixedAccount(e);
		SavingsAccount sa = new SavingsAccount(d);
		Account A = new Account(a, b, c);
		A.getAccountNumber();
		A.getBalance();
		A.getAccountHolderName();
		sa.getMinimunBalance();
		fa.getLockingPeriod();
		System.out.println("Enter account details:");
		System.out.println("AccountNumber" + "  " + "Balance" + "  " + "AccountHolderName" + "  " + "MinimunBalance"
				+ "  " + "LockingPeriod");
		System.out.println(A.getAccountNumber() + " " + A.getBalance() + " " + A.getAccountHolderName() + " "
				+ sa.getMinimunBalance() + " " + fa.getLockingPeriod());

	}
}

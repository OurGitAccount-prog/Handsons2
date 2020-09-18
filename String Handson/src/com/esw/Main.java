package com.esw;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static boolean isValid(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." + "[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
				+ "A-Z]{2,7}$";

		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter mail address:");
		String email = sc.nextLine();
		if (isValid(email))
			System.out.print("Valid email address");
		else
			System.out.print("Invalid email address");
	}
}

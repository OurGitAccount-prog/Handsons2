package com.myhcl;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Event : ");
		String eventName = sc.nextLine();
		System.out.println("Enter event detail : ");
		String eventDetail = sc.nextLine();
		System.out.println("Enter OwnerName of event : ");
		String ownerName = sc.nextLine();

		Event ev = new Event(eventName, eventDetail, ownerName);

		System.out.println("Enter the type of the event: ");
		System.out.println("1. Exhibition");
		System.out.println("2. StageEvent");
		int eventType = sc.nextInt();
		if (eventType == 1) {
			System.out.println("enter number of stalls=");
			Double stalls = sc.nextDouble();
			Exhibition eb = new Exhibition(stalls);
			System.out.println(eb.projectedRevenue());
		} else if (eventType == 2) {

			System.out.println("Enter number of shows: ");
			Double shows = sc.nextDouble();
			System.out.println("Enter number of seats per show: ");
			Double seatspershow = sc.nextDouble();
			StageEvent se = new StageEvent(shows, seatspershow);

			System.out.println(se.projectedRevenue());
		} else {
			System.out.println("Invalid EventType");
		}
	}
}

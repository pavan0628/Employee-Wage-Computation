package com.bl.oops;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWageComputation {

	// Main method
	public static void main(String[] args) {

		// Displaying a welcome message
		System.out.println("Welcome to employee wage computation Problem!!");

		// creating a new Scanner Object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a employee Name : ");
		String name = sc.nextLine();

		// creating random object
		Random random = new Random();
		int wagePerHour = 20;
		int fullDayHours = 8;

		// part-time attributes half of a full day
		int partTimeHours = 4;
		int dailyWage = 0;

		// 0 - absent , 1-present for full time , 2- present for part-time
		int attendance = random.nextInt(3);

		// solving in switch case instead of if-else to find the attendance status
		switch (attendance) {
		case 1:
			System.out.println("Employee " + name + " is Present for full-time");
			// calculating daily wage for full time
			dailyWage = wagePerHour * fullDayHours;
			break;
		case 2:
			System.out.println("Employee " + name + " is Presnt for part-time");
			// calculating the wage for part time
			dailyWage = wagePerHour * partTimeHours;
		case 0:
			System.out.println("Employee " + name + " is Absent!!");
			dailyWage = 0;
			break;
		default:
			System.out.println("Invalid Attendance!");
		}

		// Output of the daily wage
		System.out.println("Daily Employee Wage is : " + dailyWage);
		sc.close();
	}
}

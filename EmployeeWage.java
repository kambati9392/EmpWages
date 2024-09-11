package com.bridgelabz.employeewage;

public class EmployeeWage {
	public static void main(String[] args) {
		int wagePerHour = 20;
		int fullDay = 8;
		int halfDay = 4;

		System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
		System.out.println("");

		// Generate a random number between 0 and 2
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		if (empCheck == 0) {
			System.out.println("Employee is Present for a Full Day");
			System.out.println("The daily wage of Employee is : " + (wagePerHour * fullDay));
		} else if (empCheck == 1) {
			System.out.println("Employee is Present but working part time");
			System.out.println("The daily wage of Employee is : " + (wagePerHour * halfDay));
		} else {
			System.out.println("Employee is Absent");
			System.out.println("The daily wage of Employee is : 0");
		}

		System.out.println("");
	}

}


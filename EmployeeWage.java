package com.bridgelabz.employeewage;

public class EmployeeWage {
	public static void main(String[] args) {
		int wagePerHour = 20;
		int fullDay = 8;
		int halfDay = 4;
		int totalNoOfDays = 20;
		int totalWage = 0;

		System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
		System.out.println("");

		// Calculate wage for each day based on a random status and accumulate total wage
		for (int day = 1; day <= totalNoOfDays; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case 0:
				System.out.println("Day " + day + ": Employee is Present for a Full Day");
				totalWage += wagePerHour * fullDay;
				break;
			case 1:
				System.out.println("Day " + day + ": Employee is Present but working part time");
				totalWage += wagePerHour * halfDay;
				break;
			case 2:
				System.out.println("Day " + day + ": Employee is Absent");
				// No wage for absent days
				break;
			default:
				System.out.println("Day " + day + ": Invalid employee status");
				break;
			}
		}

		System.out.println("");
		System.out.println("The total wage of Employee for " + totalNoOfDays + " days is: " + totalWage);
	}

}


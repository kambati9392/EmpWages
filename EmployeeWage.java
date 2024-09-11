package com.bridgelabz.employeewage;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if(empCheck == 0)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }

    }
	
	
	}
}

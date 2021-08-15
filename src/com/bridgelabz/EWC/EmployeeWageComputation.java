package com.bridgelabz.EWC;

import java.util.*;

public class EmployeeWageComputation {
	public static final int fullTimeEmp = 1;
	public static final int partTimeEmp = 2;
	public void dailyEmployeeWage(String company, int wagePerHour, int maxWorkDays, int maxHours ) {
		double empHours=0;
		int workDays = 0;
		while(workDays <= maxWorkDays && empHours < maxHours) {
			double hoursWorked = (int) (Math.random() * 10) % 3;
			if(hoursWorked == fullTimeEmp) {
				empHours = empHours + 8;
				workDays++;
			}
			else if(hoursWorked == partTimeEmp) {
				empHours = empHours + 4;
				workDays++;
			}
			else {
				empHours = empHours + 0;
			}
			
		}
		
		double wage = (empHours * wagePerHour) * workDays;
		System.out.println("You work in " + company + " and your wage is " + wage);
	}

	public static void main(String[] args) {
		EmployeeWageComputation obj = new EmployeeWageComputation();
		obj.dailyEmployeeWage("ABC pvt Ltd.", 20, 20, 160);
		

	}
}

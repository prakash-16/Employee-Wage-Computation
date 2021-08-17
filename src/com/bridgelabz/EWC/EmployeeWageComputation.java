package com.bridgelabz.EWC;

import java.util.*;

public class companyWage {
	
	public final String company;
	public final double wagePerHour;
	public final int maxWorkDays;
	public final int maxHours;
	public final int totalWage;
	
	public companyWage(String company, double wagePerHour, int maxWorkDays, int maxHours) {
		this.company = company;
		this.wagePerHour = wagePerHour;
		this.maxWorkDays = maxWorkDays;
		this.maxHours = maxHours;
	}
	
	public void setTotalempwage( int totalEmpWage) {
		this.totalWage = totalEmpWage;
	}
	System.out.println("For " + company + " the employee wage is " + totalWage);
}
public class EmployeeWageComputation {
	public static final int fullTimeEmp = 1;
	public static final int partTimeEmp = 2;
	public int numOfCompany = 0;
	public companyWage[] companyWageArray;

	public EmployeeWageComputation() {
		companyWageArray = new companyWage[10];
	}
	
	public void addCompany(String company, int wagePerHour, int maxWorkDays, int maxHours) {
		companyWageArray[numOfCompany] = new companyWage(company, wagePerHour, maxWorkDays, maxHours);
		numOfCompany++;
	}
	
	public void wageCalculator() {
		for(int i=0; i < numOfCompany; i++) {
			companyWageArray[i].totalEmpWage(this.wageCalculator(companyWageArray[i]));
			System.out.println("companyWageArray[i]");
		}
	}

	public int wageCalculator(companyWage companyWage) {
		double empHours = 0;
		int workDays = 0;
		while (workDays <= wageCalculator.maxWorkDays && empHours < wageCalculator.maxHours) {
			double hoursWorked = (int) (Math.random() * 10) % 3;
			if (hoursWorked == fullTimeEmp) {
				empHours = empHours + 8;
				workDays++;
			} else if (hoursWorked == partTimeEmp) {
				empHours = empHours + 4;
				workDays++;
			} else {
				empHours = empHours + 0;
			}

		}

		return (empHours * companyWage.wagePerHour) * workDays;
		
	}
	
	public static void main(String[] args) {
		EmployeeWageComputation C1 = new EmployeeWageComputation("Dmart",20,20,180);
		C1.wageCalculator();
		
	}

	

}




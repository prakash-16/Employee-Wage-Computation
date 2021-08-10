package com.bridgelabz.EWC;
import java.util.*;
public class EmployeeWageComputation {
	public static final int wage_per_hour = 20;
	public static void main(String[] args) {
		
		int part_time_wage_per_hour = 20, worked_hour,wage;
		System.out.println(" Enter the number of hours you worked - ");
		Scanner sc= new Scanner(System.in);
		worked_hour = sc.nextInt();
		wage = worked_hour * part_time_wage_per_hour;
		System.out.println(" Your wage is " + wage);
	}

}

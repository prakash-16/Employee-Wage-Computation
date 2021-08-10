package com.bridgelabz.EWC;
import java.util.*;
public class EmployeeWageComputation {
	public static final int wage_per_hour = 20;
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Employee Computation Program ");
		int emp_present = 1, emp_result_attendance,worked_hour,wage;
		double check_emp_attendance = Math.floor(Math.random()*10)%2;
		emp_result_attendance = (int)check_emp_attendance;
		if(emp_present == (emp_result_attendance)){
			System.out.println(" Employee is Present ");
		}	
		else {
			System.out.println(" Employee is Absent ");
		}
		System.out.println(" Enter the number of hours you worked - ");
		Scanner sc= new Scanner(System.in);
		worked_hour = sc.nextInt();
		if(worked_hour < 1 || worked_hour > 8) {
			System.out.println(" Please enter correct input (1-8) ");
		}
		else {
			wage = worked_hour * wage_per_hour;
			System.out.println("Your wage is " + wage );
		}
	}

}

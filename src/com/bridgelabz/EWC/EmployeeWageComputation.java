package com.bridgelabz.EWC;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		
		System.out.println(" Welcome to Employee Computation Program ");
		int emp_present = 1, emp_result_attendance;
		double check_emp_attendance = Math.floor(Math.random()*10)%2;
		emp_result_attendance = (int)check_emp_attendance;
		if(emp_present == (emp_result_attendance)){
			System.out.println(" Employee is Present ");
		}	
		else {
			System.out.println(" Employee is Absent ");
		}
	}

}

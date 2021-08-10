package com.bridgelabz.EWC;
import java.util.*;
public class EmployeeWageComputation {
	public static final int wage_per_hour = 20,  daily_work_hour_min = 1, daily_work_hour_max = 8, monthly_work_day_min = 0, monthly_work_day_max = 20 ;
	public static void main(String[] args) {
		
		int i;
		int case_number, worked_day,monthly_worked=0,monthly_wage,monthly_hour=0;
		int daily_worked_hour[] = new int[20];
		int daily_employee_wage[] = new int[20];
		for(i=0;i<20;i++) {
			
			daily_worked_hour[i] = (int) (Math.random()*(daily_work_hour_max - daily_work_hour_min + 1) + daily_work_hour_min);
			daily_employee_wage[i] = daily_worked_hour[i] * wage_per_hour;
		}
		for(i=0;i<20;i++) {
			monthly_worked = monthly_worked + daily_employee_wage[i];
			monthly_hour = monthly_hour + daily_worked_hour[i]; 
		}
		worked_day  = (int) (Math.random()*(monthly_work_day_max - monthly_work_day_min + 1) + monthly_work_day_min);
		System.out.println(" 1: Calculate Monthly wage");
		System.out.println(" 2: Calcualte wages till a condtion");
		System.out.println(" Enter the case number - ");
		Scanner sc= new Scanner(System.in);
		case_number = sc.nextInt();
		switch(case_number) {
		
		case 1:
			//Calculating Monthly Wage
			
			monthly_wage = monthly_worked * worked_day;
			System.out.println(" Your Monthly Wage is " + monthly_wage);
			break;
		case 2:
			//Applying condition
			if(monthly_hour >= 100 || worked_day >= 20) {
				monthly_wage = monthly_worked * worked_day;
				System.out.println(" Your Monthly Wage is " + monthly_wage);	
			}
			else {
				System.out.println("You have not cleared the conditions please choose case 1.");
			}
			break;
		}
	}	

}

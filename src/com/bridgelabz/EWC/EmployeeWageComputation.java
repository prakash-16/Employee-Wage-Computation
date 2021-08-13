package com.bridgelabz.EWC;
import java.util.*;
public class EmployeeWageComputation {
	public static final int daily_work_hour_min = 1, daily_work_hour_max = 8;
    public static final double wage_per_hour = 20.0;
    public static double dailyEmployeeWage(){
		double hours_worked = (int) (Math.random()*(daily_work_hour_max-daily_work_hour_min+1)+daily_work_hour_min);
		double wage = hours_worked * wage_per_hour;
		return wage;
	}
	public static void main(String[] args) {
		 double result;
		 result = dailyEmployeeWage();
		 System.out.println("Your daily employee wage is " + result);
		
	}
}	





package com.bridgelabz.emp_wage9;

public class OopsEmpWage {
	
	static final int isFullTime = 1;

    // Method to check employee is present or absent by using random function
    public static void empCheck() {

        double empCheck = Math.floor(Math.random() * 10 ) % 2;
        if(empCheck == isFullTime)
            System.out.println("Employee is present !");
        else
            System.out.println("Employee is absent !");
    }
}



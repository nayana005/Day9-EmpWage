package com.bridgelabz.emp_wage9;

public class OopsEmpWage {
	
	public static final int isPartTime = 1;
    public static final int isFullTime = 2;

    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {

        // Variables
        int empHour = 0, totalEmpHour = 0, totalWorkingDays = 0;

        // Computation
        while(totalEmpHour <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case isFullTime:
                    empHour = 8;
                    break;

                case isPartTime:
                    empHour = 4;
                    break;

                default:
                	empHour = 0;
            }
            // Calculation
            totalEmpHour += empHour;
            System.out.println("Days : " + totalWorkingDays + " Emp Hour :" + empHour);
        }
        int totalEmpWage = totalEmpHour * empRatePerHour;
        System.out.println("\nTotal Employee Wage for company : " +company+ " is :"+totalEmpWage);
        System.out.println();
        System.out.println("=====================================================================");
        return totalEmpWage;
    }


}

	
	
	
	
	
	
	
	
	



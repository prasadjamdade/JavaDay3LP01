package com.day3a;

import java.util.Scanner;

public class WageOfEmployeeUsingSwitch {
    public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please enter 1 for full time Employee Wage.\n Please enter 2 for part time Employee Wage. ");
        int wagePerHour = 20;
        int hoursPerDay = 8;
        int hoursPartTime = hoursPerDay/2;
        int option = scanObj.nextInt();
        switch(option)
        {
            case 1 : System.out.println("The Daily Wage of Full Time Employee is: " + wagePerHour * hoursPerDay + " INR");
            break;
            case 2 : System.out.println("The Daily Wage of Part Time Employee is: " + wagePerHour * hoursPartTime + " INR");
            break;
            default : System.out.println("Invalid Entry...");
        }
    }
}

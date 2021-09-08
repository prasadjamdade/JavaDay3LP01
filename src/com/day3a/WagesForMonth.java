package com.day3a;
import java.util.*;

public class WagesForMonth {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please enter 1 for Monthly wage of full time Employee Wage.\n" +
                "Please enter 2 for Monthly wage of  part time Employee Wage. ");
        int wagePerHour = 20;
        int hoursPerDay = 8;
        int hoursPartTime = hoursPerDay / 2;
        int workingDaysPerMonth = 20;
        int option = scanObj.nextInt();
        switch (option) {
            case 1:
                System.out.println("The Monthly Wage of Full Time Employee is: " + wagePerHour * hoursPerDay * workingDaysPerMonth + " INR");
                break;
            case 2:
                System.out.println("The Monthly Wage of Part Time Employee is: " + wagePerHour * hoursPartTime * workingDaysPerMonth + " INR");
                break;
            default:
                System.out.println("Invalid Entry...");
        }
    }
}
package com.day3a;
import java.util.*;

public class WageLimiter {
    public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please enter 1 for full time Employee Wage.\n" +
                "Please enter 2 for part time Employee Wage. ");
        int wagePerHour = 20;
        int hoursPerDay = 8;
        int hoursPartTime = hoursPerDay / 2;
        //int workingDaysPerMonth = 20;
        int optionPartFull = scanObj.nextInt();
        switch (optionPartFull) {
            case 1:
                    System.out.println("Please enter 1 to calculate on basis of number of hours worked.\n" +
                                        "Please enter 2 to calculate on basis of number of days worked.");
                    int optionHourDaysFull = scanObj.nextInt();
                    switch(optionHourDaysFull){
                        case 1:
                            System.out.println("Please enter number of hours worked: ");
                            int hoursWorked = scanObj.nextInt();
                            if (hoursWorked <= 100)
                                System.out.println("The Wage of Full Time Employee for " + hoursWorked + " hours is: " + wagePerHour  * hoursWorked + " INR");
                            else
                                System.out.println("Cannot print beyond 100 hours for a month.");
                            break;
                        case 2:
                            System.out.println("Please enter number of days worked: ");
                            int daysWorked = scanObj.nextInt();
                            if (daysWorked <= 20)
                                System.out.println("The Wage of Full Time Employee for " + daysWorked + " days is: " + wagePerHour * hoursPerDay * daysWorked + " INR");
                            else
                                System.out.println("Cannot print beyond 20 days for a month.");
                            break;
                        default:
                            System.out.println("Invalid entry...");
                    }
                break;
            case 2:
                System.out.println("Please enter 1 to calculate on basis of number of hours worked.\n" +
                        "Please enter 2 to calculate on basis of number of days worked.");
                int optionHourDaysPart = scanObj.nextInt();
                switch(optionHourDaysPart) {
                    case 1:
                        System.out.println("Please enter number of hours worked: ");
                        int hoursWorked = scanObj.nextInt();
                        if (hoursWorked <= 100)
                            System.out.println("The Wage of Part Time Employee for " + hoursWorked + " hours is: " + wagePerHour * hoursWorked + " INR");
                        else
                            System.out.println("Cannot print beyond 100 hours for a month.");
                        break;
                    case 2:
                        System.out.println("Please enter number of days worked: ");
                        int daysWorked = scanObj.nextInt();
                        if (daysWorked <= 20)
                            System.out.println("The Wage of Part Time Employee for " + daysWorked + " days is: " + wagePerHour * hoursPartTime * daysWorked + " INR");
                        else
                            System.out.println("Cannot print beyond 20 days for a month.");
                        break;
                    default:
                        System.out.println("Invalid entry...");
                }
                break;
            default:
                System.out.println("Invalid Entry...");


        }
    }
}

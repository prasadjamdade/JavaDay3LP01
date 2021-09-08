package com.day3a;

public class WageOfPartTimeEmployee {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int hoursPerDay = 8;
        int hoursPartTime = hoursPerDay/2;
        System.out.println("The Daily Wage of Employee is: " + wagePerHour*hoursPerDay + " INR");
        System.out.println("The Daily Wage of Part Time Employee is: " + wagePerHour*hoursPartTime + " INR");
    }
}

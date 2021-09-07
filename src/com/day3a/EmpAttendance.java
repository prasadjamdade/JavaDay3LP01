package com.day3a;

public class EmpAttendance {
    public static void main(String[] args) {
        int attendanceStatus = (int) (Math.random()+0.5);
        if ( attendanceStatus == 0){
            System.out.println("Employee is Absent");
        }
        else
            System.out.println("Employee is Present");
    }
}

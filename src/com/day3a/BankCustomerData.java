package com.day3a;
import java.util.*;
import java.lang.*;

public class BankCustomerData {

    //Class level Variables
    static String bankName = "Lakshmi Cheat Funds. pvt. ltd.";

    public String getCustomerName() {
        return customerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public String getLocality() {
        return locality;
    }

    String customerName;
    long accountNumber;
    int customerAge;
    String locality;


    //Constructor
    public BankCustomerData(String name, long accNumber, int age, String city) {
        this.customerName = name;
        this.accountNumber = accNumber;
        this.customerAge = age;
        this.locality = city;
    }

    public static void display2(BankCustomerData dataEntry){
        System.out.println("Bank Name: \""+bankName
                +"\",\nCustomer Name: \""+ dataEntry.getCustomerName()
                + "\",\nAccount Number: \""+ dataEntry.getAccountNumber()
                + "\",\nAge Of Customer: \"" + dataEntry.getCustomerAge()
                + "\",\nLocality of Customer: \"" + dataEntry.getLocality() + "\".");
    }



    //Main Method
    public static void main(String[] args) {


         //Scanner Object
        Scanner displayAccount = new Scanner(System.in);

            System.out.println("Enter the customer name.");
            String name = displayAccount.next();

            System.out.println("Enter the account number.");
            long accNumber = displayAccount.nextLong();

            System.out.println("Enter the age of customer.");
            int age = displayAccount.nextInt();

            System.out.println("Enter the locality of customer.");
            String city = displayAccount.next();
            BankCustomerData dataEntry = new BankCustomerData(name, accNumber, age, city);

        display2(dataEntry);


    }



}


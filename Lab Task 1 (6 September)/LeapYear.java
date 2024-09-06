package com.basicjava;

public class LeapYear {
    public static void main(String[] args) {
        int year=2016;
        System.out.println("Given Year is: "+year);
        if (year%400==0)
            System.out.println("It's a Leap Year");
        else if (year%4==0 && year%100!=0)
            System.out.println("It's a Leap Year");
        else
            System.out.println("It's not a Leap Year");

    }
}

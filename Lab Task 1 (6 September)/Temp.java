package com.basicjava;
//Conversion between Celsius and Fahrenheit
public class Temp {
    public static void main(String[] args) {
        double temp1=0;
        double ConvTemp1= ((temp1/5)*9)+32;
        System.out.println("Temperature in Celsius: "+temp1);
        System.out.println("Converted temperature in Fahrenheit: "+ConvTemp1);
        double temp2=212;
        System.out.println();
        double ConvTemp2=((temp2-32)/9)*5;
        System.out.println("Temperature in Fahrenheit: "+temp2);
        System.out.println("Converted temperature in Celsius: "+ConvTemp2);

    }
}

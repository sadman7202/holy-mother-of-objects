package com.basicjava;

public class Factorial {
    public static void main(String[] args) {
        long fact=1;
        int n=5;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println("Factorial of "+n+": "+fact);
    }
}

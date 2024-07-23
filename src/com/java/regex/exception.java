package com.java.regex;
import java.util.Scanner;

import java.util.InputMismatchException;

class exception {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	float divisor;
    	try {
    		System.out.println("Enter an Integer divisor");
    		divisor=sc.nextFloat();
    		double answer = 100/divisor;
    		System.out.println("Your Answer is "+answer);
    	}
    	catch(ArithmeticException e) {
    		System.out.println("Arithmetic Exception");
    		
    	}
    	
    	catch (InputMismatchException e) {
            System.out.println("Input mismatch - Only integer is allowed");
    	}
    	System.out.println("Exception Handled successfully");
}}

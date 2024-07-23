package com.java.regex;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

class validator {
	String myRegex="^(?=.*[A-Z][a-z])(?=.*\\d)(?=.*[@!#$%^&*]).{8,12}$";
	Pattern pattern=Pattern.compile(myRegex);
	public boolean validation(String password) {
	if (password ==null) 
	{
	return false;
	}
	Matcher matcher= pattern.matcher (password);
	return matcher.matches();
	}
	}
	public class PasswordChecker {
	public static void main(String[] args) {
		validator v = new validator();
		System.out.println("Enter your Password");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		   if (v.validation(password)) 
		   {
               System.out.println("Your Password is valid.");
           } 
		   else 
           {
               System.out.println("Your Password is invalid.");
               System.out.println("Please try again with valid password!!!");
           }
	}
	}
	
	

package com.parthiban.bakery;

import java.util.Scanner;

public class BakerySwitch {

	public static void main(String[] args) {
			double Cakebill =0.0;
			double Puffbill=0.0;
			double Pizzabill = 0.0;
			double Burgerbill= 0.0;
			double totalbill= 0.0;
			String continueResponse;
			boolean continueShopping = false;
			double cakequantity;
			Scanner sc = new Scanner (System.in);
			System.out.println("              !!! Welcome to our Bakery !!!");
			do { 
				System.out.println("Please confirm the Item");
				System.out.println("Press 1 for cake");
				System.out.println("Prss 2 for puffs");
				System.out.println("Press 3 for Pizza");
				System.out.println("Press 4 for Burger");
				
				int product=sc.nextInt();
				switch(product)

				int cake = sc.nextInt();
				switch (cake)
				{
				case 1:
					System .out.println("You have selected Black Forest");
					System .out.println("Enter the Quantity in Kgs");
					cakequantity = sc.nextDouble();
					Cakebill = cakequantity*900;
					break;
					
				case 2:
					System .out.println("You have selected Red Velvet");
					System .out.println("Enter the Quantity in Kgs");
					cakequantity = sc.nextDouble();
					Cakebill = cakequantity*1200;
					break;
					
				case 3: 
					System .out.println("You have selected Cream cake");
					System .out.println("Enter the Quantity in Kgs");
					cakequantity = sc.nextDouble();
					Cakebill = cakequantity*400;
					
				default:
					System.out.println("Invalid Product");
					
				System.out.println("Your bill amount is: Rs. "+ Cakebill+ "/-");
				}
				System.out.println("Do you want to continue your purchase? (yes/no)");	
				continueResponse = sc.next();
			}
			while (!continueResponse.equalsIgnoreCase("no"));

			totalbill=Cakebill+Puffbill+Pizzabill+Burgerbill;
			System.out.println("Your total bill amount is: Rs. " + totalbill + "/-");
			System.out.println("        !!! Thank you for Shopping with us!!!");		
	}

}

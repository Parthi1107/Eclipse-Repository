package com.parthiban.Items;
import java.util.Scanner;

public class Bakery1 {
		
	public static void main(String[] args)
		{
		Scanner sc = new Scanner (System.in);
		double totabill=0;
		String continueResponse;

	        Pizza pizza = new Pizza(200);
	        Burger burger = new Burger(200);
	        
	        System.out.println("              !!! Welcome to our Bakery !!!");

			do { 
				System.out.println("Please confirm the Item");
				System.out.println("Press 1 for cake");
				System.out.println("Prss 2 for puffs");
				System.out.println("Press 3 for Pizza");
				System.out.println("Press 4 for Burger");

				int product = sc.nextInt();
				
				switch (product)
				{
				case 1:
					System.out.println("Enter the type");
				int type = sc.nextInt();
				System.out.println("Enter the quantity");
				double quantity = sc.nextDouble();
				if (type==1)
				{
				Cake blackForestCake = new Cake("Black Forest", 900);
				
				}
				else if (type==2)
				{
		        Cake redVelvetCake = new Cake("Red Velvet", 1200);
				}
				else if (type==3)
				{
		        Cake creamCake = new Cake("Cream Cake", 400);
				}
				else 
				{
				System.out.println("Invalid Type");
				}
				break;
				case 2:
					int pufftype=sc.nextInt();
					if (pufftype==1)
					{					
					  Puff vegPuff = new Puff("Veg Puff", 15);
					}
					else if(pufftype==2)
					{
				        Puff eggPuff = new Puff("Egg Puff", 20);
					}
					else if(pufftype==3)
					{
				        Puff chickenPuff = new Puff("Chicken Puff", 30);
					}
					
					else 
					{
					System.out.println("Invalid Type");
					}
					break;
				}	}}}}		
		
	
			
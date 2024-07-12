package com.parthiban.Items;

public class Pizza {

		public double ratePerPizza;

	    public Pizza(double ratePerPizza) {
	        this.ratePerPizza = ratePerPizza;
	    }

	    public double getRatePerPizza() {
	        return ratePerPizza;
	    }

	    public double calculateBill(int quantity) {
	        return quantity * ratePerPizza;
	    
	    
	    }}



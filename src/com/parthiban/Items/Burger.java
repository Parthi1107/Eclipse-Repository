package com.parthiban.Items;

public class Burger {

	private double ratePerBurger;

    public Burger(double ratePerBurger) {
        this.ratePerBurger = ratePerBurger;
    }

    public double getRatePerBurger() {
        return ratePerBurger;
    }

    public double calculateBill(int quantity) {
        return quantity * ratePerBurger;
    }
}
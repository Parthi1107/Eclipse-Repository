package com.parthiban.Items;

public class Cake {

	private String type;
    private double ratePerKg;

    public Cake(String type, double ratePerKg) {
        this.type = type;
        this.ratePerKg = ratePerKg;
    }

    public String getType() {
        return type;
    }

    public double getRatePerKg() {
        return ratePerKg;
    }

    public double calculateBill(double quantity) {
        return quantity * ratePerKg;
    }
}



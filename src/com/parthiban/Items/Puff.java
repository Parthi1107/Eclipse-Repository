package com.parthiban.Items;

public class Puff {

	private String type;
    private double ratePerPiece;

    public Puff(String type, double ratePerPiece) {
        this.type = type;
        this.ratePerPiece = ratePerPiece;
    }

    public String getType() {
        return type;
    }
    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public double calculateBill(int quantity) {
        return quantity * ratePerPiece;
    }
}
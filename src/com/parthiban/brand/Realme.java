package com.parthiban.brand;

import com.parthiban.appliances.mobile;

public class Realme extends mobile{

	private String SpecialFeature;
	public String getSpecialFeature() {
		return SpecialFeature;
	}
	public void setSpecialFeature(String specialFeature) {
		SpecialFeature = specialFeature;
	}
	
	public static void main(String[] args) {

		mobile m = new mobile();
		m.setColor("Grey");
		m.setDisplay("Amoled");
		m.setModel("Realme 12 Pro");
		m.setPrice(26000.00d);
		m.setRam(12);
		m.setProcessor("Snapdragon 7 Gen 1");

		System.out.println("Color: " + m.getColor());
		System.out.println("Display: " + m.getDisplay());
		System.out.println("Model: " + m.getModel());
		System.out.println("Price: " + m.getPrice());
		System.out.println("Ram: " + m.getRam());
		System.out.println("Processor: " + m.getProcessor());

	}

}

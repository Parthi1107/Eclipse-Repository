package com.parthiban.brand;

import com.parthiban.appliances.mobile;

public class Oneplus {

	public static void main(String[] args) {
		mobile m = new mobile();
		m.setColor("White");
		m.setDisplay("Amoled");
		m.setModel("Oneplus 12");
		m.setPrice(18000.00d);
		m.setRam(12);
		
		System.out.println("Color: " + m.getColor());
		System.out.println("Display: " + m.getDisplay());
		System.out.println("Model: " + m.getModel());
		System.out.println("Price: " + m.getPrice());
		System.out.println("Ram: " + m.getRam());
	}

}

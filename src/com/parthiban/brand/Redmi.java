package com.parthiban.brand;
import com.parthiban.appliances.*;

public class Redmi {

	public static void main(String[] args) {
		
		mobile m = new mobile();
		m.setColor("Black");
		m.setDisplay("Amoled");
		m.setModel("Note 13");
		m.setPrice(15000.00d);
		m.setRam(8);
		
		System.out.println("Color: " + m.getColor());
		System.out.println("Display: " + m.getDisplay());
		System.out.println("Model: " + m.getModel());
		System.out.println("Price: " + m.getPrice());
		System.out.println("Ram: " + m.getRam());

	}


}


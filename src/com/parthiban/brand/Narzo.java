package com.parthiban.brand;
import com.parthiban.appliances.*;

public class Narzo extends Realme{

	public static void main(String[] args) {
		
		Narzo N = new Narzo();
		N.setSpecialFeature("SeamlessGaming");
		N.setProcessor("Dimensity 9000");
		
		System.out.println("Special Feature:" + N.getSpecialFeature());
		System.out.println("Processor: " + N.getProcessor());
	

	}

}

package com.parthiban.brand;
import com.parthiban.appliances.*;

public class OneplusInterface {
	public static void main(String[] args) {
		mobileInterface m = new newMobile();
        m.setColor("White");
        m.setDisplay("Amoled");
        m.setModel("Oneplus 12");
        m.setPrice(18000.00d);
        m.setRam(12);
        m.setprocessor("8+Gen3");
     
        
        System.out.println("Color: " + m.getColor());
        System.out.println("Display: " + m.getDisplay());
        System.out.println("Model: " + m.getModel());
        System.out.println("Price: " + m.getPrice());
        System.out.println("Ram: " + m.getRam());
        System.out.println("Processor: "+ m.getprocessor());

}
}

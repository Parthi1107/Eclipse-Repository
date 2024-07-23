package com.oops.encapsulation;
import com.oops.functionalinterfae.Circle;
public class AreaReturn {

	public static void main(String[] args) {
	Circle c=(r)->{
		return Math.PI*r*r;
	};
		double area = c.area(5);
		System.out.println("Area of circle: "+area);
	}

}

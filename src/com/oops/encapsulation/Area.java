package com.oops.encapsulation;
import com.oops.functionalinterfae.Circle;;
class ExtendedClass implements Circle
{

	@Override
	public double area(int radius) {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}
	
}

public class Area {

	public static void main(String[] args) {
		
		ExtendedClass e= new ExtendedClass();
	
		System.out.println("Area of circle: "+ e.area(5));
	}

	}


package com.parthiban.projects2;
import java.util.Scanner;
import com.parthiban.projects.*;

class circle extends shape
{
	double radius;
    public circle(double radius)
    {
        this.radius=radius;
    }
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getdiameter()
    {
    	return 2 *radius;
    }
    public double getcircumference()
    {
    	return 2*Math.PI*radius;
    }
}

public class output {

	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Radius");
	    double radius =sc.nextDouble();
	    circle c = new circle(radius);
	    System.out.println("Diameter: "+c.getdiameter() + "Circumference:"+c.getcircumference()+"Area: "+ c.getArea()+"Perimeter: "+c.getPerimeter());
	}
	}

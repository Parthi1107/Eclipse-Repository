package com.parthiban.brand;
import com.parthiban.appliances.*;

public class newMobile implements mobileInterface{

	private String color;
	private String model;
	private int ram;
	private double price;
	private String display;
	private String processor;

	public String getprocessor() {
		return processor;
	}
	public void setprocessor(String processor) {
		this.processor = processor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String toString() {
		return "mobile [color=" + color + ", model=" + model + ", ram=" + ram + ", price=" + price + ", display="
				+ display + ", processor=" + processor + "]";
	}

	}




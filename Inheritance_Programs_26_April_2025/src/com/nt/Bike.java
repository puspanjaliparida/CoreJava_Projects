package com.nt;

public class Bike extends Vehicle{
    String type;
	public Bike(String make, String model, int year, String type) {
		super(make, model, year);
		this.type=type;
	}
	@Override
	void displayDetails() {
		System.out.println("Made by "+make);
		System.out.println("Model of the vehicle is "+model);
		System.out.println("The year it is manufactured "+year);
		System.out.println("The type of the Vehicle "+type);
	}
}

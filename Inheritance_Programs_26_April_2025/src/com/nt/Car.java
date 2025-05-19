package com.nt;

public class Car extends Vehicle{
    int numberOfDoors;

	public Car(String make, String model, int year,int numberOfDoors) {
		super(make, model, year);
		if (numberOfDoors <= 0) {
            System.out.println("Error Invalid Input");
        }
		this.numberOfDoors=numberOfDoors;
	}
	
	@Override
	void displayDetails() {
		System.out.println("The number of doors are "+numberOfDoors);
	}
}


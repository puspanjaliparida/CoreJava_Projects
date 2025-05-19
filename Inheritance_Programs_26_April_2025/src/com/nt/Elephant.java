package com.nt;

public class Elephant extends AnimalInZoo{
    private float tuskLength;
	public Elephant(String name, int age, float tuskLength) {
		super(name, age);
		if(age<=0 || tuskLength<=0) {
			System.out.println("Error Invalid Input.");
		}
		this.tuskLength=tuskLength;
	}
	
	@Override
	   public void displayInfo() {
			System.out.println("Name: "+getName());
			System.out.println("Age: "+getAge());
	}
	
	public void makeSound() {
		System.out.println("The Elephant trumpets.");
	}
	
	public void displayTuskLength() {
		System.out.println("TuskLength "+tuskLength);
	}
}
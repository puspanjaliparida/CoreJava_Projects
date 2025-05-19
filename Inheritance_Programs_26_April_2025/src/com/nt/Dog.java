package com.nt;

public class Dog extends Mammal {
    private String breed;
    
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public Dog(String name, boolean hasFur,String breed) {
		super(name, hasFur);
		this.breed=breed;
	}
    
	@Override
	void displayAnimalDetails(){
		System.out.println("Name of the Animal is "+getName());
		System.out.println("hasFur "+isHasFur());
		System.out.println("Breed name is "+breed);
	}
}

package com.nt;

public class Mammal extends Animal {
    private boolean hasFur;
    
	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	public Mammal(String name,boolean hasFur) {
		super(name);
		this.hasFur=hasFur;
	}

	@Override
	void displayAnimalDetails(){
		System.out.println("Name of the Animal is "+getName());
		System.out.println("hasFur "+hasFur);
	}
}

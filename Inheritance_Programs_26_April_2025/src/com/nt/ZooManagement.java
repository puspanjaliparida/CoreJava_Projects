package com.nt;

public class ZooManagement {
    public static void main(String[] args) {
		Lion li=new Lion("Simba", 5, 20);
		System.out.println("Lion Details:");
		li.displayInfo();
		li.makeSound();
		li.displayManeLength();
		System.out.println();
		
		Elephant el=new Elephant("Jumbo", 10, 2.5f);
		System.out.println("Elephant Details:");
		el.displayInfo();
		el.makeSound();
		el.displayTuskLength();
	}
}

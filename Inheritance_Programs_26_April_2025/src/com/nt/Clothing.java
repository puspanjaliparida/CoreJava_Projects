package com.nt;

public class Clothing extends Product {
    private String size;
	public Clothing(String name, double price, String size) {
		super(name, price);
		if(price<=0) {
			  System.out.println("Error Invalid Input.");
		}
		this.size=size;
	}

	@Override
	public void displayInfo() {
		   System.out.println("Name: "+name);
		   System.out.println("Price: "+price);
		   System.out.println("Size: "+size);
	}
	
	@Override
	 public void calculateTotalCost(int quantity) {
		   double totalCost = price*quantity;
		   System.out.println("Total Cost for "+quantity+" units: "+totalCost);
	 }

	@Override
	public String toString() {
		System.out.println("Clothing [name=" + name + ", price=" + price + ", size=" + size +   "]");
		return "Clothing [name=" + name + ", price=" + price + ", size=" + size +   "]";
	}
}

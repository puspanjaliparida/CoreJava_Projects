package com.nt;

public class Electronics extends Product {
    private String brand;
	public Electronics(String name, double price,String brand) {
		super(name, price);
		if(price<=0) {
			  System.out.println("Error Invalid Input.");
		  }
		this.brand=brand;
	}

	@Override
	public void displayInfo() {
		   System.out.println("Name: "+name);
		   System.out.println("Price: "+price);
		   System.out.println("Brand: "+brand);
	}
	
	@Override
	 public void calculateTotalCost(int quantity) {
		   double totalCost = price*quantity;
		   System.out.println("Total Cost for "+quantity+" units: "+totalCost);
	 }
	
	@Override
	public String toString() {
		System.out.println("Electronics [name=" + name + ", price=" + price + ", brand=" + brand + "]");
		return "Electronics [name=" + name + ", price=" + price + ", brand=" + brand +   "]";
	}
}
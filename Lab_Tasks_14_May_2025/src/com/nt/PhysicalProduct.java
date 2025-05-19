package com.nt;

public class PhysicalProduct extends Product{
    private double shippingWeight;
    
	public PhysicalProduct(String name, double price, String category,double shippingWeight) {
		super(name, price, category);
		this.shippingWeight=shippingWeight;
	}

	@Override
	public void applyDiscount(double percentage) {
		double discount = (getPrice() * percentage) / 100;
        setPrice(getPrice()- discount);
        System.out.println("Physical Product:");
        System.out.println("Product Name: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.println("Price RS: " + (getPrice() + discount));
        System.out.println("Shipping Weight: " + shippingWeight + " kg");
        System.out.println("Discount applied: " + discount);
        System.out.println("New Price: " + getPrice());
	}

	@Override
	public double calculateTax() {
		return getPrice() * 0.08;
	}

	public double calculateShippingCost() {
		return shippingWeight * 5.0;
	}
	
	@Override
	public String toString() {
		return "PhysicalProduct [shippingWeight=" + shippingWeight + "]";
	}
}

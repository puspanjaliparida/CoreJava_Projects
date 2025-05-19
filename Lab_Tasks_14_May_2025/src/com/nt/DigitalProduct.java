package com.nt;

public class DigitalProduct extends Product{
    private String licenseKey;
	public DigitalProduct(String name, double price, String category,String licenseKey) {
		super(name, price, category);
		this.licenseKey=licenseKey;
	}
	
	@Override
	public void applyDiscount(double percentage) {
		double discount = (getPrice() * percentage) / 100;
        setPrice(getPrice()- discount);
        System.out.println("Digital Product:");
        System.out.println("Product Name: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.println("Price: " + (getPrice() + discount));
        System.out.println("License Key: " + licenseKey);
        System.out.println("Discount applied: " + discount);
        System.out.println("New Price: " + getPrice());
	}
	
	@Override
	public double calculateTax() {
		return getPrice() * 0.05;
	}

	@Override
	public String toString() {
		return "DigitalProduct [licenseKey=" + licenseKey + ", getPrice()=" + getPrice() + "]";
	}
}

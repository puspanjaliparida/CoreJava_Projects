package com.nt;

public class OnlineShopping {
    public static void main(String[] args) {
		Electronics el=new Electronics("Laptop", 1200.00, "Dell");
		System.out.println("Electronics Details:");
		el.displayInfo();
		el.calculateTotalCost(2);
		el.toString();
		
		System.out.println();
		
		Clothing cl=new Clothing("T-Shirt", 25.0, "Medium");
		System.out.println("Clothing Details:");
		cl.displayInfo();
		cl.calculateTotalCost(3);
		cl.toString();
    }
}

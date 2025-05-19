package com.nt;

public class AmazonMainClass {
   public static void main(String[] args) {
	 AmazonProduct p1=new AmazonProduct("SmartPhone",30000.00,"Electronics");
	 p1.displayProductDetails();
	 p1.applyDiscount();
	 System.out.println();
	 
	 AmazonProduct p2=new AmazonProduct();
	 p2.setName("T-Shirt");
	 p2.setPrice(1500.00);
	 p2.setCategory("Clothing");
	 p2.displayProductDetails();
	 p2.applyDiscount();
	 System.out.println();
	 
	 AmazonProduct p3=new AmazonProduct("Book",500.00,"Books");
	 p3.displayProductDetails();
	 p3.applyDiscount();
	 System.out.println();
	 
	 AmazonProduct p4=new AmazonProduct("Tablet",20000.00,"Electronics");
	 p4.updatePrice(18000);
	 p4.displayProductDetails();
	 p4.applyDiscount();
	 System.out.println();
	 
	 AmazonProduct p5=new AmazonProduct("Laptop",25000.0,"Electronics");
	 p5.setPrice(-1000.00);
	 p5.setName("");
	 p5.setCategory(null);
	 p5.displayProductDetails();
	 p5.applyDiscount();
   }
}
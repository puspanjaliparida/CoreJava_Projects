package com.nt;

import java.util.Scanner;

public class ProductStore {
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Select Product Type:");
      System.out.println("1.Digital Product");
      System.out.println("2.Physical Product");
      
      String choice = sc.nextLine();
      
      switch (choice) {
      case "1":
    	  System.out.print("Enter Digital Product Name: ");
          String pName = sc.nextLine();
          if (pName == null || pName.isEmpty()) {
              System.out.println("Product name cannot be empty or null.");
              return;
          }
          System.out.print("Enter Product Price: ");
          double pPrice = sc.nextDouble();
          if (pPrice < 0) {
              System.out.println("Price cannot be negative.");
              return;
          }
          sc.nextLine(); 

          System.out.print("Enter Product Category: ");
          String pCategory = sc.nextLine().trim();
          if (pCategory == null || pCategory.isEmpty()) {
              System.out.println("Category cannot be empty or null.");
              return;
          }

          System.out.print("Enter Product License Key: ");
          String licenseKey = sc.nextLine();

          DigitalProduct dp = new DigitalProduct(pName, pPrice, pCategory, licenseKey);
          dp.applyDiscount(10);
          dp.calculateTax();
          break;
          
      case "2":
    	  System.out.print("Enter Physical Product Name: ");
          String ppName = sc.nextLine();
          if (ppName == null || ppName.isEmpty()) {
              System.out.println("Product name cannot be empty or null.");
              return;
          }
          System.out.print("Enter Product Price: ");
          double ppPrice = sc.nextDouble();
          if (ppPrice < 0) {
              System.out.println("Price cannot be negative.");
              return;
          }
          sc.nextLine(); 

          System.out.print("Enter Product Category: ");
          String ppCategory = sc.nextLine().trim();
          if (ppCategory == null || ppCategory.isEmpty()) {
              System.out.println("Category cannot be empty or null.");
              return;
          }

          System.out.print("Enter Product Shipping Weight: ");
          double shippingWeight = sc.nextDouble();

          PhysicalProduct pp = new PhysicalProduct(ppName, ppPrice, ppCategory, shippingWeight);
          pp.applyDiscount(10);
          pp.calculateTax();
          break;

      }
   }
}

/*               SET-B
 * Ques - 3
--------------
Dynamic Pricing Calculation for Online Marketplace

You've been tasked with developing a Java program for an online marketplace that calculates the total cost of a customer's order with a dynamic pricing system. The pricing calculation is influenced by the product categories and whether the customer is a frequent shopper. Your objective is to design a flexible solution using functional interfaces and lambda expressions to handle the pricing calculation process effectively.

Your program should include the following components:

Functional Interfaces:

Define a functional interface named PricingStrategy with a method double calculatePrice(double totalAmount, boolean isFrequentShopper) that encapsulates the logic for calculating prices based on the current strategy. The isFrequentShopper parameter indicates whether the customer is a frequent shopper.
Functional Interface for Product Categories:

Define another functional interface named ProductCategoryChecker with a method double applyCategoryDiscount(double totalAmount, String category) that applies discounts based on specific product categories.
Main Program:

Prompt the user to enter the total order amount in rupees.
Prompt the user to specify if they are a frequent shopper (yes/no).
Prompt the user to enter the product category.
Apply the lambda expressions representing the pricing strategy and product category discount to calculate the final price based on the provided inputs.
Calculate and print the total cost of the order after applying the pricing strategy in rupees.
Pricing Strategy Logic:

Initially, the pricing strategy offers a 10% discount for electronic products, a 5% discount for clothing items, and no discount for other categories. An additional 5% discount is applied if the customer is a frequent shopper.

Sample Input and Output:
-------------------------
Welcome to the Online Marketplace!

Enter the total order amount in rupees: ₹1500
Are you a frequent shopper? (yes/no): yes
Enter the product category: electronics

Total cost after pricing strategy: ₹1350.00

 * */
package com.nt;

import java.util.Scanner;

@FunctionalInterface
interface PricingStrategy {
	double calculatePrice(double totalAmount, boolean isFrequentShopper);
}

@FunctionalInterface
interface ProductCategoryChecker {
	double applyCategoryDiscount(double totalAmount, String category);
}
public class OnlineMarketplace {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Online Marketplace!");
        System.out.print("Enter the total order amount in rupees:₹");
        double totalAmt = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Are you a frequent shopper?(yes/no): ");
        String input = sc.nextLine();
        boolean frequentShopper = input.equals("yes");
        
        System.out.println("Enter the product category: ");
        String category=sc.nextLine();
        
        
        ProductCategoryChecker categoryChecker = (amt, cat) -> {
            if (cat.equalsIgnoreCase("electronics")) {
                return amt * 0.90; 
            } else if (cat.equalsIgnoreCase("clothing")) {
                return amt * 0.95;
            } else {
                return amt;
            }
        };

        double afterCategoryDiscount = categoryChecker.applyCategoryDiscount(totalAmt, category);

        PricingStrategy pricingStrategy = (amt, isFrequent) -> {
            if (isFrequent) {
                return amt * 0.95; 
            } else {
                return amt;
            }
        };

        double finalPrice = pricingStrategy.calculatePrice(afterCategoryDiscount, frequentShopper);

       
        System.out.printf("Total cost after pricing strategy: ₹%.2f\n", finalPrice);

        sc.close();
    }
}

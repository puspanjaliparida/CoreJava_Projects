/*                                SET-B
Ques - 1
-----------
 Product Discount Calculator

Create a Java program that calculates the discounted price of products based on their original prices and implements the Consumer functional interface using lambda expressions. The program should allow the user to input the prices of multiple products and then calculate and display their discounted prices.

Your program should follow these specifications:

Input:

Prompt the user to enter the number of products.
Prompt the user to enter the original prices of each product.
Processing:

Define a lambda expression to calculate the discounted price for each product, using the Consumer interface.
Apply the lambda expression to each product's original price to calculate and display their discounted prices.
Assume a fixed discount rate of 10% for all products.

Output:
Print the discounted price for each product
*/
package com.nt;
import java.util.Scanner;
import java.util.function.Consumer;

public class ProductDiscountCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        double[] prices = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter price of product " + (i + 1) + ": ");
            prices[i] = sc.nextDouble();
        }

        Consumer<Double> discountCalculator = price -> {
            double discountedPrice = price - (price * 0.10); 
            System.out.printf("Discounted Price: %.2f%n", discountedPrice);
        };

        System.out.println("Discounted Prices ");
        for (int i = 0; i < n; i++) {
            discountCalculator.accept(prices[i]);
        }
    }
}


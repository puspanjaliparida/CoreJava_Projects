/*                            SET-B
 * Ques - 2
--------------
Create a Java program that checks three properties of numbers entered by users and implements the Predicate functional interface using lambda expressions for each property. The program should prompt users to input numbers and verify if they satisfy the specified properties.

Your program should follow these specifications:

Input:

Prompt the user to enter a number.
Processing:

Define three lambda expressions, each checking a specific property of the entered number using the Predicate interface:
Lambda expression 1: Check if the number is divisible by 2.
Lambda expression 2: Check if the number is divisible by 3.
Lambda expression 3: Check if the number is divisible by 5.
Apply each lambda expression to determine if the entered number satisfies the respective properties.
Output:

Print whether the entered number is divisible by 2 or not.
Print whether the entered number is divisible by 3 or not.
Print whether the entered number is divisible by 5 or not.

 * */
package com.nt;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        Predicate<Integer> isDivisibleBy2 = n -> n % 2 == 0;
        Predicate<Integer> isDivisibleBy3 = n -> n % 3 == 0;
        Predicate<Integer> isDivisibleBy5 = n -> n % 5 == 0;
        
        System.out.println("Checking Divisibility by 2,3and5");
        System.out.println("Divisible by 2: " + isDivisibleBy2.test(number));
        System.out.println("Divisible by 3: " + isDivisibleBy3.test(number));
        System.out.println("Divisible by 5: " + isDivisibleBy5.test(number));
    }
}

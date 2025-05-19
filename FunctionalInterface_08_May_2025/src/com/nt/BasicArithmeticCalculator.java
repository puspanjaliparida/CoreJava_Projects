/*                                            SET-C
 * Ques - 2
--------------
Basic Arithmetic Calculator

Design a Java program that performs basic arithmetic operations on input numbers based on user-selected operations and implements the Function functional interface using lambda expressions. The program should prompt users to input two numbers and specify the operation they want to perform.

Your program should follow these specifications:

Input:

Prompt the user to enter two numbers.
Prompt the user to select an operation:
Option 1: Addition
Option 2: Subtraction
Option 3: Multiplication
Processing:

Define lambda expressions for each arithmetic operation using the Function interface.
Apply the selected lambda expression to perform the arithmetic operation on the input numbers.
Output:

Print the result of the selected arithmetic operation.
Example:
--------------
Enter the first number: 10
Enter the second number: 5
Select an operation:
1. Addition
2. Subtraction
3. Multiplication
Enter your choice: 3
Result of multiplication: 50*/

package com.nt;
import java.util.Scanner;
import java.util.function.Function;

class TwoNumbers {
    double num1;
    double num2;

    public TwoNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class BasicArithmeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Function<TwoNumbers, Double> addition = n -> n.num1 + n.num2;
        Function<TwoNumbers, Double> subtraction = n -> n.num1 - n.num2;
        Function<TwoNumbers, Double> multiplication = n -> n.num1 * n.num2;

        TwoNumbers numbers = new TwoNumbers(num1, num2);

        double result = 0;
        boolean valid = true;
        
        switch (choice) {
            case 1:
                result = addition.apply(numbers);
                System.out.println("Result of addition: " + result);
                break;
            case 2:
                result = subtraction.apply(numbers);
                System.out.println("Result of subtraction: " + result);
                break;
            case 3:
                result = multiplication.apply(numbers);
                System.out.println("Result of multiplication: " + result);
                break;
            default:
                System.out.println("Invalid choice.");
                valid = false;
        }
    }
}

/*                         SET-A
 * Ques - 2
--------------
Number Transformation

Write a Java program that transforms a positive integer entered by the user using lambda expressions and the Function functional interface. The program should use lambda expressions to define the transformations: one to double the number and another to square the number.

Your program should follow these specifications:

Input:

Prompt the user to enter a positive integer.
Processing:

Define a lambda expression to double the input number using the Function interface.
Define a lambda expression to square the input number using the Function interface.
Apply both lambda expressions to the input number separately to obtain the transformed results.

Output:

Print the result of doubling the entered number.
Print the result of squaring the entered number.
*/
package com.nt;

import java.util.Scanner;
import java.util.function.Function;

public class NumberTransformation {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter one number::");
	   int num=sc.nextInt();
	   
	   Function<Integer, Integer> dob=(n)->{
		   return n = n*2; 
	   };
	   System.out.println(num+" double is "+dob.apply(num));
	   
	   Function<Integer, Integer> square=(n)->{
		 return n=n*n;  
	   };
	   System.out.println(num+" square is "+square.apply(num));   
   }
}


/*                               SET-A
 * Ques - 1
--------------
Write a Java program that prompts the user to enter a positive integer and checks if the entered number is both positive and prime. The program should use lambda expressions to implement the necessary checks and print out the results separately.

Your program should follow these specifications:

Input:

Prompt the user to enter a positive integer.
Processing:

Implement a lambda expression to check if a given number is positive, using the Predicate interface.
Implement a lambda expression to check if a given number is prime,  using the Predicate interface.
Use the implemented lambda expressions to separately check if the entered number is positive and if it is prime.

Output:

Print whether the entered number is positive.
Print whether the entered number is prime
*/

package com.nt;

import java.util.Scanner;
import java.util.function.Predicate;


public class PositiveAndPrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number::");
		int num=sc.nextInt();
		
		Predicate<Integer> prime=(n)->{
			int count=0;
			if(n!=1) {
				for(int i=2;i<=n/2;i++) {
					if(n%i==0) {
						count++;
					}
				}
				if(count==0) {
					return true;
				}
				else {
					return false;
				}
			
			}
			else {
				return false;
			}
		};
		System.out.println(num+" is Prime "+prime.test(num));
		
		Predicate<Integer> positive=(n1)->{
			for(int i=0;i<=n1;i++) {
				if(n1>0) {
				  return true;
				}
				else {
					return false;
				}
			}
			return false;
		};
		System.out.println(num+" is Positive "+positive.test(num));
	}
}

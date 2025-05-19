/*2.WAP for the following requirement::
-Create a functional interface which has a functionality 
 to display the number taken as input and check that number is even or odd.
-Perform functional programming with support of lambda expression
 to provide implementation to the Single Abstract Method.*/
package com.nt;

@FunctionalInterface
interface NumberChecker {
    void showNumber(int num);
}
public class EvenOddFunctionalInterface {
    public static void main(String[] args) {
    	NumberChecker n1=(input)->{
			if (input%2==0){
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		};
		n1.showNumber(19);
	}
    
}
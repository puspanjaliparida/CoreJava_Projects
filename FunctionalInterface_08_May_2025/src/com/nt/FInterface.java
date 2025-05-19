/*1.WAP for the following requirement::
-Create a functional interface which has a functionality 
 to display the number taken as input.
-Perform functional programming with support of lambda expression
 to provide implementation to the Single Abstract Method.*/
package com.nt;

@FunctionalInterface
interface FInterface {
    void showNumber(int num);
}

class FunctionalInterfaceNumber{
	public static void main(String[] args) {
		FInterface f1=(input)->{System.out.println("The number is:"+input);};
		f1.showNumber(20);
	}
}

/*2. Reverse a String
     Accept a string and print its reverse without using built-in 
     reverse() method.
*/
package com.nt;

import java.util.Scanner;

public class ReverseString {
    public static void reverseAString(String input) {
    	String reverse="";
    	char ch;
    	for (int i= input.length()-1; i>=0;i--) {
            reverse = reverse+input.charAt(i);
    	}
    	System.out.println("Reversed String is::"+reverse);
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter A String::");
    	String input=sc.nextLine();
    	reverseAString(input);
    	sc.close();
    }
}

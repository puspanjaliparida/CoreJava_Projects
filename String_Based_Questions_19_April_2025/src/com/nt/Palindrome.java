/*3. Check for Palindrome
     Write a program to check whether an input string is a palindrome or not.
     (e.g.,madam, racecar)
*/
package com.nt;

import java.util.Scanner;

public class Palindrome {
    public static void reverseAString(String input) {
    	String reverse="";
    	char ch;
    	for (int i= input.length()-1; i>=0;i--) {
            reverse = reverse+input.charAt(i);
    	}
    	if(input.equalsIgnoreCase(reverse)) {
    		System.out.println("The String is a Palindrome");
    	}
    	else {
    		System.out.println("The String is not a Palindrome");
    	}
    }
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter A String::");
    	String input=sc.nextLine();
    	reverseAString(input);
    	sc.close();
    }
}
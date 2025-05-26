/*Question.2) 
write a java program for checking the given String is Palindrome or not.
Take one Class as CheeckingPalindrome inside this class take one static method as
public static boolean isPalindrome(String input); inside this method write your logic for checking Palindrome.
in the main method call this method and check your code.
Example: input String s1="madam";
         output : your String madam is Palindrome.
         input String s1="Tiger";
         output : your String Tiger is not a Palindrome.*/
package com.nt;

import java.util.Scanner;

public class CheckForPalindrome {
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
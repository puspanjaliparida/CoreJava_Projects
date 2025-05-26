/*2.WAP to allow the user to enter a string and display.
 * */
package com.nt;

import java.util.Scanner;

public class String_Scanner {
      public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String::");
		String str=sc.nextLine();
		System.out.println("Value entered :"+
		str);	
	}
}

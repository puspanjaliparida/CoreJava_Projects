/*3.WAP to allow the user to enter a string and display the length of the string.
 */
package com.nt;
import java.util.Scanner;

public class String_Length {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String::");
		String str=sc.nextLine();
		int len=str.length();
		System.out.println("The Length of the String is: "+len);
	}
}

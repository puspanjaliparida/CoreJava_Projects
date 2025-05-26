/*4.WAP to check the position of any character in the String.*/
package com.nt;

import java.util.Scanner;

public class String_Position {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str=sc.nextLine();
		System.out.println("Enter a character to check the position in String: ");
		String inp=sc.next();
		int pos=str.indexOf(inp);
		System.out.println(inp+" is at index: "+pos);
	}
}

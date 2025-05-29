package com.nt;

import java.util.Scanner;

public class LowerCaseToUpperCase {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		s=s.toUpperCase();
		System.out.println("After converting upper case to lower case: ");
		System.out.println(s);
	}
}

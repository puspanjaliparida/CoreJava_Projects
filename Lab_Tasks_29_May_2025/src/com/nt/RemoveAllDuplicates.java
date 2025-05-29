package com.nt;

import java.util.Scanner;

public class RemoveAllDuplicates {
    public static String removeDuplicate(String s,char ch) {
		return s=s.replaceAll(String.valueOf(ch),"");
    }
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		System.out.println("After removing the Duplicates the String is::");
		char ch=sc.next().charAt(0);
		System.out.println(removeDuplicate(s,ch));
	}
}

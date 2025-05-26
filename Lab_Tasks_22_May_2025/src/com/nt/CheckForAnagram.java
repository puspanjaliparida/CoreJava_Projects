/*Question.1)
 Write a Java program  that checks if two strings are anagrams of each other or not (ignoring case and spaces).
 input: String s1="listen"; String  s2="silent";
output : Given Strings are anagram.


input: String s1="Triangle"; String  s2="Integral"
output : Given Strings are anagram.


input: String s1="apple"; String s2="pale";
output : Given Strings are  not anagram.
 * */
package com.nt;

import java.util.Arrays;
import java.util.Scanner;

public class CheckForAnagram {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First String::");
		String str1=sc.nextLine();
	
		System.out.println("Enter the Second String::");
		String str2=sc.nextLine();
		
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Given Strings are anagram");
		}
		else {
			System.out.println("Given Strings are not anagram");
		}
	}
}

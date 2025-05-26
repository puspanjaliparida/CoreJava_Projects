/*5.Write a program to enter a string and check whether it is palindrome or not.
*/
package com.nt;
public class Palindrome {
	public static boolean isPalindrome(String str) {
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			else {
				left++;
				right--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		 String str="Java";
		 if(isPalindrome(str)) {
			 System.out.println("Palindrome");
		 }
		 else {
			 System.out.println("Not a Palindrome");
		 }
	}
}
  
/*1. Count Vowels and Consonants
     Write a program to input a string and count the number of 
     vowels and consonants in it.
*/
package com.nt;
import java.util.Scanner;

public class VowelAndConsonants {
	public static void checkVowelOrConsonant(String input) {

        int vCount = 0;
        int cCount = 0;

        char ch;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);

            if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z')){
            	if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'
            			||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
            		vCount++;
            	}
            else {
            	cCount++;
            }
        }
        }

        System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);

        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        checkVowelOrConsonant(input);
        scanner.close();
    }
   
}
/*4. Count Words in a Sentence
     Input a sentence and count the number of words. Assume words are 
     separated by single spaces.
*/
package com.nt;

import java.util.Arrays;
import java.util.Scanner;

public class CountWordsInASentence {
   public static void coundWords(String str) {
	   String  words[]=str.trim().split("\\s+");
	   System.out.println(Arrays.toString(words));
	   
	   System.out.println("No.of Words::"+words.length);
   }
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter A Sentence:");
   	   String str=sc.nextLine();
   	   coundWords(str);
   	   sc.close();
   }
}


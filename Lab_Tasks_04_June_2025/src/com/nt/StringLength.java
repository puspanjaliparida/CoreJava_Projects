/*Question.1)
Write a java program for finding each String 
length from Strings Array through 
Stream api method.
input: String[]s={"SashiKant","Raone","Bhole",
       "Tomato"};
output:
SashiKant: 9
Raone: 5
Bhole: 5
Tomato: 6*/
package com.nt;
import java.util.Arrays;

public class StringLength {
   public static void main(String[] args) {
	  String[] s= {"SashiKant","Raone","Bhole","Tomato"};
	  System.out.println("The Lengths of the Strings are:: ");
	  Arrays.stream(s).map(String::length).forEach(System.out::println);
   }
}

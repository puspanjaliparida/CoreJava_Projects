/*Question.1)
write the java program for getting first char of each
string by using stream api method. 
input : String []words={"Raj","Rahul","Gopal","Bunty","Aman"};
output: Expected as: [R, R, G, B, A]..*/
package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GettingFirstChar {
	    public static void main(String[] args) {
	        String[] words = {"Raj", "Rahul", "Gopal", "Bunty", "Aman"};
	        List<String> firstChars = Arrays.stream(words)
	                .map(word -> String.valueOf(word.charAt(0)))
	                .collect(Collectors.toList());
	        System.out.println(firstChars); 
	    }
}

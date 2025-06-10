/*2.WAP to display a list of string by converting them to upper case.*/
package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
		List<String> words=Arrays.asList("Ramu","Chiku","Monkey","Bag");
		List<String> result=words.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(result);
	}
}

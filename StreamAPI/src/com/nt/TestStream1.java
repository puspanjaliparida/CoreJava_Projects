/*1.Collection of Data*/
package com.nt;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TestStream1 {
    public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("C");
		al.add("DSA");
		al.add(".net");
		al.add("Devops");
		//Printing all elements using forEach()
		Stream<String> stream=al.stream();
		//stream.forEach(inp->System.out.println(inp));
		//Print all elements using concept of method reference
		stream.forEach(System.out::println);
	}
}

/*2.Create a Stream out of an array*/
package com.nt;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Arrays;

public class TestStream2 {
    public static void main(String[] args) {
    	int arr[]= {10,30,50,30,20,100,80,90,40};
    	IntStream s=Arrays.stream(arr);
    	s.forEach(System.out::println);
    	String course[]= {"java","python","c","DSA",",.net","devops"};
    	
        Stream<String> stream=Arrays.stream(course);
        stream.forEach(System.out::println);
        
        Arrays.stream(course).forEach(System.out::println);
    }
}

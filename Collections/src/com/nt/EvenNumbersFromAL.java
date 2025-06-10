/*1.WAP to filter out the even number from an ArrayList.Collect them into
 *a List and display.
 *Note:
 *-Array of elements are represented as a List by the help of asList()
 *-We can collect elements from a filtered group of elements by the help
 *of collect().
 *-We can represent collected elements as a List by the support of
 *Collectors.toList().*/
package com.nt;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class EvenNumbersFromAL {
     public static void main(String[] args) {
		//Representing array of elements as List
    	 List<Integer> number= Arrays.asList(10,21,47,80,56,71);
    	 
    	//creating a stream,filtered the elements based on condition,collected
    	// the elements and represented as List
    	 List<Integer> result=number.stream().
    			 filter(n->n%2==0).
    			 collect(Collectors.toList());
    	 //forEach(System.out::println);
    	 result.forEach(System.out::println);
	}
}

/*6.WAP to display all the odd numbers from 1 to 10.*/
package com.nt;
import java.util.stream.Stream;
public class TestStream6 {
    public static void main(String[] args) {
    	//Prints all numbers from 1 to 10
		//Stream.iterate(1,n->n+1).limit(10).forEach(System.out::println);
		
		//Prints all odd numbers from 1 to 10
		//Stream.iterate(1,n->n+2).limit(5).forEach(System.out::println);
		
		//Code update in iterate() after Java9 without using limit()
		//Prints from 1 to 10 
		Stream.iterate(1, n->n<=10,n->n+1).forEach(System.out::println);
		
		//Prints from 1 to 10 odd numbers
		Stream.iterate(2, n->n<=10,n->n+2).forEach(System.out::println);
	}
}

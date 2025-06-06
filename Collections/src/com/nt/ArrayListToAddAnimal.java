/*Write a Java Program to create an array list ,add some animal(strings)
 *and print the collection.*/
package com.nt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class ArrayListToAddAnimal {
    public static void main(String[] args) {
		ArrayList<String> animal=new ArrayList<String>();
		animal.add("Dog");
		animal.add("Elephant");
		animal.add("Horse");
		animal.add("Tiger");
		animal.add("Lion");
		animal.add("Zebra");
		
		//animal.add(100);
		System.out.println("1.Printing elements by Iterator: ");
		Iterator<String> i=animal.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
		System.out.println("\n2.Printing elements by forloop: ");
		for(int j=0;j<animal.size();j++) {
			System.out.print(animal.get(j)+" ");
		}
		System.out.println();
		
		System.out.println("\n3.Printing elements by foreach(): ");
		animal.forEach(str->System.out.print(str+" "));
		System.out.println();
		
		System.out.println("\n4.Printing elements by foreach loop : ");
		for(String str:animal) {
			System.out.print(str+ " ");
		}
		System.out.println();
	
		//Enumeration<String> e=((Object)animal).elements(); 
		
		System.out.println("\n5.Printing elements by listiterator: ");
		ListIterator<String> ltr=animal.listIterator();
		while(ltr.hasNext()) {
			System.out.print(ltr.next()+ " ");
		}
		System.out.println();
		
		System.out.println("\n6.Printing elements by stream api : ");
		Stream<String> stream=animal.stream();
		stream.forEach(a->System.out.print(a+" "));
		System.out.println();
		
		System.out.println("\n7.Printing elements by SplitIterator-forEachRemaining");
		Spliterator<String> splitr=animal.spliterator();
		splitr.forEachRemaining(an->System.out.print(an+" "));
		System.out.println();
		
		System.out.println("\n8.Printing elements by SplitIterator-tryAdvance()");
		Spliterator<String> sp=animal.spliterator();
		while(sp.tryAdvance(a->System.out.print(a+" "))); 
	}
}

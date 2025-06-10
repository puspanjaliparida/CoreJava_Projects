/*6.WAP to display the number of elements which are greater than 50*/
package com.nt;

import java.util.Arrays;
import java.util.List;

public class DisplayNumGreaterThan50 {
    public static void main(String[] args) {
		List<Integer> number=Arrays.asList(10,60,28,78,22,90);
		long count=number.stream().filter(n->n>50).count();
		System.out.println("Number of elements greater than 50 are: "+count);
	}
}

/*5.WAP to sort a list of elements in Descending order.*/
package com.nt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingDESC {
	public static void main(String[] args) {
		   List<Integer> num=Arrays.asList(10,20,32,11,23,1,55,77);
		   List<Integer> sortedDesc=num.stream().
				   sorted(Comparator.reverseOrder()).
				   collect(Collectors.toList());
		   System.out.println(sortedDesc);
	}
}

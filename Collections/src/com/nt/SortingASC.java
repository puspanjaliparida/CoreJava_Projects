/*4.WAP to sort a list of elements in ascending order.*/
package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingASC {
   public static void main(String[] args) {
	   List<Integer> num=Arrays.asList(10,20,32,11,23,1,55,77);
	   List<Integer> sortedasc=num.stream().sorted().collect(Collectors.toList());
	   System.out.println(sortedasc);
   }
}

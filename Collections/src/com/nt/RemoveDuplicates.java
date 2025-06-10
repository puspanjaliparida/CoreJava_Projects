/*3.WAP to remove the duplicate elements(String) from an ArrayList.*/
package com.nt;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class RemoveDuplicates {
  public static void main(String[] args) {
	  List<String> names=Arrays.asList("Khushi","Omm","Mama","Puchku","Khushi","Omm");
	  System.out.println("All names are: "+names);
	  List<String> unique=names.stream().distinct().collect(Collectors.toList());
	  System.out.println("Unique names are: "+unique);
  }
}

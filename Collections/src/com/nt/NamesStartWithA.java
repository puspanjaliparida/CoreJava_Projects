/*7.WAP to display the names which start with A and their length>4.*/
package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NamesStartWithA {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Alia","Khushi","Anjali","Ahmed","Ahaan","omm");
	    List aName4=names.stream().filter(str->str.startsWith("A")&& str.length()>4).
	    		collect(Collectors.toList());	    
	    System.out.println("The names that are starts with A and length greater than 4 are :"+aName4);
	}
}

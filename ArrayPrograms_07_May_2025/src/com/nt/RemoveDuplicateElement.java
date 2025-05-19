package com.nt;

import java.util.Arrays;

 class RemovingDuplicateElement {
	int[] elements= {101,102,103,101,104,105,102};
	int occuranceCount=0;
	public void displayRepeatedElements() {
		Arrays.sort(elements);
		System.out.println("Array Elements: "+Arrays.toString(elements));
		for(int i=0;i<elements.length;i++) {
			int count=0;
			for(int j=0;j<elements.length-1;j++) {
				if(elements[i]==elements[j] && i>j) {
				    break;	
				}
				if(elements[i]==elements[j]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(elements[i]+" "+ "Available "+count+" times");
				occuranceCount++;
			}
		}
		System.out.println(occuranceCount+" Elements Are Repeated.");
	}
}
 
 public class RemoveDuplicateElement{
	 public static void main(String[] args) {
		 RemovingDuplicateElement f1=new RemovingDuplicateElement();
		 f1.displayRepeatedElements();
	} 
 }

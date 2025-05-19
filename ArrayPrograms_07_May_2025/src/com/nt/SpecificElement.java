/*Q4. WAP to check whether an array contains a specific element.*/
package com.nt;

import java.util.Scanner;

class SearchSpecificElement{
	int element[]=new int[5];
	public void search(int element[]) {
		for(int i=0;i<element.length;i++) {
			this.element[i]=element[i];//Copying from Array
		}
	}
	
	public void findTheElement(int key) {
		boolean isPresent=false;
		for(int i=0;i<element.length;i++) {
			if(key==element[i]) {
				isPresent=true;
				break;
			}
		}
		if(isPresent==true) {
			System.out.println("Element "+key+" is found");
		}
		else {
			System.err.println("Element "+key+" not found");
		}
	}
}

public class SpecificElement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Numbers::");
		int element[]=new int[5];
	    for(int i=0;i<element.length;i++) {
	    	element[i]=sc.nextInt();
	    }
	    SearchSpecificElement w1=new SearchSpecificElement();
	    w1.search(element);
	    System.out.println("Enter The Number to Search:: ");
	    int key=sc.nextInt();
	    w1.findTheElement(key);
	}
}

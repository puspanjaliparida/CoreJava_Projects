/*Q3. A scientific calculator has a memory buffer to pre-fill factorials of numbers
from 1 to 10 for fast access. Write a program to automatically store factorials
from 1 to 10 in an array and display them.*/
package com.nt;

public class ScientificCalculator {
    public static void main(String[] args) {
    	for(int num=1;num<=10;num++) {
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("The Factorial of "+num+" is "+factorial);
    	}
	}
}
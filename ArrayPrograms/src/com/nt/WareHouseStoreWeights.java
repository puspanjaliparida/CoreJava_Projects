/*Q6) A warehouse stores the weights of all packages received in a day. When
      a supervisor searches for a specific package weight, the system should
      report its position in the list.
      Requirement:
      Write a Java program to store package weights in an array. Accept a
      weight from the user and print the index location of the weight if it
      exists. If not found, display an appropriate message.
 * */

package com.nt;

import java.util.Scanner;

class WareHouseStore{
	int weights[]=new int[10];
	public void takePackageWeights(int weights[]) {
		for(int i=0;i<weights.length;i++) {
			this.weights[i]=weights[i];//Copying from Array
		}
	}
	
	public void findWeights(int key) {
		boolean isPresent=false;
		int pos=0;
		for(int i=0;i<weights.length;i++) {
			if(key==weights[i]) {
				isPresent=true;
				pos=i;
				break;
			}
		}
		if(isPresent==true) {
			System.out.println("Package Weight "+key+" is present at index "+pos);
		}
		else {
			System.err.println("Package Weight "+key+" not found");
		}
	}
}

public class WareHouseStoreWeights{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Weights of the Products:");
		int[] weights=new int[10];
	    for(int i=0;i<weights.length;i++) {
	    	weights[i]=sc.nextInt();
	    }
	    WareHouseStore w1=new WareHouseStore();
	    w1.takePackageWeights(weights);
	    System.out.println("Enter The Weight To Search: ");
	    int key=sc.nextInt();
	    w1.findWeights(key);
	}
}
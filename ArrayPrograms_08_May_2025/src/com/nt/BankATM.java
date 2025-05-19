/*Q1. A bank ATM logs the last 10 transactions a user has performed.
You need to analyze the transactions to find the sum of transactions
made on odd-numbered days and even-numbered days, assuming transactions
are stored in order of days from day 1 to day 10.*/
package com.nt;

public class BankATM {
    public static void main(String[] args) {
		double arr[]= {1000.0,203.0,100.0,125.0,500.0,200.0,100.0,400.0,300.0,900.0};
		double Evensum=0.0;
		double Oddsum=0.0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				Evensum=Evensum+arr[i];
			}
			else if(arr[i]%2!=0) {
				Oddsum=Oddsum+arr[i];
			}
		}
		System.out.println("Sum of Even numbers is:: "+Evensum);
		System.out.println("Sum of Odd numbers is:: "+Oddsum);
	}
}

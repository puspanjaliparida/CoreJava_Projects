/*Q2. A SmartWatch stores the number of steps taken every hour for 10 hours.
You are required to calculate the total number of even step counts recorded
during odd hours of the day to determine periods of low-intensity activity.*/
package com.nt;

public class Smartwatch {
    public static void main(String[] args) {
		int hour[]= {1,2,3,4,5,6,7,8,9,10};
		int steps[]= {1000,2014,1023,1000,2943,2677,2384,2838,1221,1233};
		int stepCount=0;
		for(int i=0;i<hour.length;i++) {
			if(hour[i]%2!=0 && steps[i]%2==0) {
				stepCount=stepCount+steps[i];
			}
		}
		System.out.println("Total steps count:: "+stepCount);
	}
}


/*Q10) In an event management system, participant IDs are recorded in an array.
       The organizer wants to list only those participants who registered uniquely
       (not repeated).
       Write a Java program to print all unique participant IDs.
       Example Input:
       int[] participantIds = {301, 302, 303, 302, 304, 305, 301};
       Expected Output:
       Unique Participants: 303, 304, 305
 * */
package com.nt;

import java.util.Arrays;

class Event{
	int[] participantIds= {301,302,303,302,304,305,301};
	int occuranceCount=0;
	
	public void displayNonRepeatedId() {
		Arrays.sort(participantIds);
		System.out.println("Array Elements: "+Arrays.toString(participantIds));
		System.out.println("Unique Participants:");
		
		for(int i=0;i<participantIds.length;i++) {
			int count=0;
			
			for(int j=0;j<participantIds.length;j++) {
				if(participantIds[i]==participantIds[j]) {
					count++;
				}
			}
			if(count==1) {
					System.out.println(participantIds[i]);
					occuranceCount++;
			}
		}
		//System.out.println(occuranceCount+" Unique Category IDs found.");
	}
}

public class EventManagementSystem {
   public static void main(String[] args) {
	   Event r1=new Event();
	   r1.displayNonRepeatedId();
   }
}

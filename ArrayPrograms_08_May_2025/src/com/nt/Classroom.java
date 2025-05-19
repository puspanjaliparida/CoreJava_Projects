/*Q6. In a classroom, there are 10 seats. Students from Group A and Group B are
to be seated alternately:
Odd positions (1, 3, 5, 7, 9) → Students from Group A
Even positions (2, 4, 6, 8, 10) → Students from Group B
Store and display the final seating arrangement using array C.*/
package com.nt;

public class Classroom {
    public static void main(String[] args) {
		String GroupA[]= {"A1","A2","A3","A4","A5"};
		String GroupB[]= {"B1","B2","B3","B4","B5"};
		String GroupC[]=new String[10];
		
		int a=0;
		int b=0;
		
		for(int i=0;i<GroupC.length;i++) {
			if((i+1)%2 !=0) {
				GroupC[i]=GroupA[a++];
			}
			else {
				GroupC[i]=GroupB[b++];
			}
		}
		System.out.println("Seats are:");
		for(int i=0;i<GroupC.length;i++) {
			System.out.println("seat"+(i+1)+" "+GroupC[i]);
		}
		
	}
}
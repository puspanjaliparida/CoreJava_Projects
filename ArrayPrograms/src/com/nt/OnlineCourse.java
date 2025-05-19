/*Q3)An online course platform tracks the number of students attending
     live classes each day. The instructor wants to know the day with the
     highest attendance to evaluate the most engaging session.
     Requirement:
     Write a Java program that stores the attendance for each day in an array
     and finds the maximum attendance recorded.
 * */
package com.nt;

import java.util.Scanner;

public class OnlineCourse {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int att[] = new int[6];
			String day[]= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			for(int i=0;i<att.length;i++) {
				System.out.println("Enter the Attendance for "+day[i]);
				att[i]=sc.nextInt();
			}
			
			int maxAtt=att[0];
			int dayIndex=0;
			for(int i=1;i<att.length;i++) {
				if(maxAtt<att[i]) {
					maxAtt=att[i];
					dayIndex=i;
				}
			}
			System.out.println("The Hingest attendance is :"+maxAtt+" on "+day[dayIndex]);
		}
	}
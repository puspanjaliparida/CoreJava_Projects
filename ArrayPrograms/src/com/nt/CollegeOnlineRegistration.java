/*Q1) A college has a new online registration system for events. Each student
      registering for an event is given a unique registration ID. The college
      wants to dynamically store these registration IDs as students register
      one by one.
      Requirement:
      Write a Java program that allows dynamic insertion of registration IDs
      into an array using Scanner. After all registrations are complete, display
      all stored registration IDs.
 * */
package com.nt;

import java.util.Scanner;

class EventCollege {

    public static void registerStudent() {
        Scanner sc = new Scanner(System.in);
        String[] id = new String[5];

        for (int i = 0; i < id.length; i++) {
            System.out.print("Enter id " );
            id[i] = sc.next();
        }

        displayStudentDetails(id);
        sc.close();
    }

    public static void displayStudentDetails(String[] id) {
        System.out.println("\nRegistered Student IDs:");
        for (int i = 0; i < id.length; i++) {
            System.out.println("Student " + (i + 1) + " ID: " + id[i]);
        }
    }
}

public class CollegeOnlineRegistration {
    public static void main(String[] args) {
        EventCollege.registerStudent();
    }
}


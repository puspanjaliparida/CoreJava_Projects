/*Question: University Management System
Scenario:
You are designing a University Management System to manage individuals within a university. The system should represent a general Person, a Student, and a GraduateStudent using a multilevel inheritance structure.

The Person class contains common attributes like name and age.
The Student class extends Person and adds roll number and course.
The GraduateStudent class extends Student and adds specialization and GPA.

You must:
- Use encapsulation to protect all fields.
- Use constructor overloading and constructor chaining.
- Provide methods to display individual details and validate GPA.

Requirements:
Create the following class hierarchy:

Person class (Base class)
--------------------
Private attributes:

String name
int age

Methods:
- Default and parameterized constructors
- Getters and setters
void displayPersonInfo()

Student class (inherits from Person)
---------------------------------------
Private attributes:

- String rollNumber
- String course

Methods:
- Default and parameterized constructors using constructor chaining
- Getters and setters
- void displayStudentInfo()

GraduateStudent class (inherits from Student)
------------------------------------------------
Private attributes:

- String specialization
- double gpa

Methods:

- Default and parameterized constructors using constructor chaining
- Getters and setters
- void displayGraduateStudentInfo()
- void validateGPA() — If GPA is below 3.0, print "GPA below required threshold";
   otherwise, print "GPA is acceptable"

Test Case 1: Create GraduateStudent with parameterized constructor
Input:
GraduateStudent g1 = new GraduateStudent("Alice", 24, "S101", "M.Sc Computer Science", "AI", 3.5);
g1.displayGraduateStudentInfo();
g1.validateGPA();

Expected Output:
Name: Alice
Age: 24
Roll Number: S101
Course: M.Sc Computer Science
Specialization: AI
GPA: 3.5
GPA is acceptable


Test Case 2: Create GraduateStudent using default constructor + setters
Input:
GraduateStudent g2 = new GraduateStudent();
g2.setName("Bob");
g2.setAge(26);
g2.setRollNumber("S102");
g2.setCourse("M.Sc Data Science");
g2.setSpecialization("Big Data");
g2.setGpa(2.8);
g2.displayGraduateStudentInfo();
g2.validateGPA();

Expected Output:
Name: Bob
Age: 26
Roll Number: S102
Course: M.Sc Data Science
Specialization: Big Data
GPA: 2.8
GPA below required threshold

Test Case 3: Invalid age and GPA
Input:
GraduateStudent g3 = new GraduateStudent();
g3.setAge(-1);
g3.setGpa(-4.0);

Expected Output:
Invalid age. Age must be positive.
Invalid GPA. GPA must be between 0.0 and 4.0.*/
package com.nt;

public class Person {
   private String name;
   private int age;
  
   public Person() {}
   
   public Person(String name,int age) {
	   this.name=name;
       this.age=age;
   }
   
   public void setName(String name) {
	   this.name=name;
   }
   
   public String getName() {
	   return name;
   }
   
   public void setAge(int age) {
	   this.age=age;
	   if(age<0) {
		   System.out.println("Invalid age. Age must be positive.");
	   }
   }
   
   public int getAge() {
	   return age;
   }
   
   void displayPersonInfo() {
	   System.out.println("Name: "+name);
	   System.out.println("Age: "+age);
   }
}

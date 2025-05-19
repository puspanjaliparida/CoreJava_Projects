package com.nt;

public class UniversityMainClass {
   public static void main(String[] args) {
	   GraduateStudent g1=new GraduateStudent("Alice",24,"S101","M.Sc Computer Science","AI",3.5);
	   g1.displayGraduateStudentInfo();
	   g1.validateGPA();
	   System.out.println();
	   
	   GraduateStudent g2=new GraduateStudent();
	   g2.setName("Bob");
	   g2.setAge(26);
	   g2.setRollNumber("S102");
	   g2.setCourse("M.Sc Data Science");
	   g2.setSpecialization("Big Data");
	   g2.setGpa(2.8);
	   g2.displayGraduateStudentInfo();
	   g2.validateGPA();
	   System.out.println();
	   
	   GraduateStudent g3=new GraduateStudent();
	   g3.setAge(-1);
	   g3.setGpa(-4.0);
   }
}

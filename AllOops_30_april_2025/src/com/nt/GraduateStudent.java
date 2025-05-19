package com.nt;

public class GraduateStudent extends Student {
    private String specialization;
    private double gpa;
    
    public GraduateStudent() {}

	public GraduateStudent(String name, int age, String rollNumber, String course,String specialization,double gpa) {
		super(name, age, rollNumber, course);
		this.specialization=specialization;
		this.gpa=gpa;
	}
    
    public void setSpecialization(String specialization) {
    	this.specialization=specialization;
    }
    
    public String getSpecialization() {
    	return specialization;
    }
    
    public void setGpa(double gpa) {
    	this.gpa=gpa;
    	if(gpa<0) {
    		System.out.println("Invalid GPA.GPA must be between 0.0 and 4.0.");
    	}
    }
    
    public double getGpa() {
    	return gpa;
    }
    
    void displayGraduateStudentInfo() {
       System.out.println("Name: "+getName());
 	   System.out.println("Age: "+getAge());
 	   System.out.println("RollNumber: "+getRollNumber());
 	   System.out.println("Course: "+getCourse());
 	   System.out.println("Specilization: "+getSpecialization());
 	   System.out.println("Gpa: "+getGpa());   
    }
    
    void validateGPA() {
    	if(getGpa()>=3.0) {
    		System.out.println("GPA is acceptable.");
    	}
    	else {
    		System.out.println("GPA below required threshold.");
    	}
    }
}

package com.nt;

public class Sourcing {
   int id;
   String name;
   double basicSalary;
   double HRAPer;
   double DAPer;
   int enrollmentTarget;
   int enrollmentReached;
   double peakPerEnrollment;
   
   public int getId() {
	return id;
   }

   public void setId(int id) {
	this.id = id;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public double getBasicSalary() {
	return basicSalary;
   }

   public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
   }

   public double getHRAPer() {
	return HRAPer;
   }

   public void setHRAPer(double hRAPer) {
	HRAPer = hRAPer;
   }

   public double getDAPer() {
	return DAPer;
   }

   public void setDAPer(double dAPer) {
	DAPer = dAPer;
   }

   public int getEnrollmentTarget() {
	return enrollmentTarget;
   }

   public void setEnrollmentTarget(int enrollmentTarget) {
	this.enrollmentTarget = enrollmentTarget;
   }

   public int getEnrollmentReached() {
	return enrollmentReached;
   }

   public void setEnrollmentReached(int enrollmentReached) {
	this.enrollmentReached = enrollmentReached;
   }

   public double getPeakPerEnrollment() {
	return peakPerEnrollment;
   }

   public void setPeakPerEnrollment(double peakPerEnrollment) {
	this.peakPerEnrollment = peakPerEnrollment;
   }

   public double calculateGrossSalary() {
	   return basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*peakPerEnrollment;
   }
}

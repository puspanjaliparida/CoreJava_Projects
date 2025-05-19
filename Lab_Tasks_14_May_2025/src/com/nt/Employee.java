/*Based on method overloading..
 * The payroll system of an organization involves 
 * calculating the gross salary of each type of
 * employee and the tax applicable to each.Create 
 * the following entity classes as described below.
 * 
 * Class Employee:-
 * Fields:id:int,name:String,basicSalary:double,
 *         HRAPer:double,DAPer:double 
 * Public Method:calculateGrossSalary()-returns a double
 * Calculate the gross salary as:basicSalary+HRAPer+DAPer
 *  
 * Class Manager:-
 * Fields:id:int,name:String,basicSalary:double,
 *        HRAPer:double,DAPer:double,projectAllowance:double
 * Public Method:calculateGrossSalary()-returns a double
 * Calculate the gross salary as:basicSalary+HRAPer+DAPer+projectAllowance
 * 
 * Class Trainer:-
 * Fields:id:int,name:String,basicSalary:double,
 *        HRAPer:double,DAPer:double,batchCount:int,
 *        perkPerBatch:double
 * public method:calculateGrossSalary()-returns a double
 * Calculate the gross salary as:basicSalary+HRAPer+DAPer+(batchCount*perkPerBatch)
 * 
 * Class Sourcing:-
 * Fields:id:int,name:String,basicSalary:double,HRAPer:double,
 *        DAPer:double,enrollementTarget:int,enrollmentReached:int,
 *        perkPerEnrollement:double
 * Public Method:calculateGrossSalary()-returns a double
 * Calculate the Gross Salary as:basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment
 * 
 * Class TaxUtil:-
 * Fields:None
 * Public Methods:calculateTax(Employee)-returns tax
 *                doublecalculateTax(Manager)-returns tax
 *                doublecalculateTax(Trainer)-returns tax
 *                doublecalculateTax(Sourcing)-returns a tax
 * Tax Calculation Logic:If gross salary is greater than 30000 tax is 20%
 * else,tax is 5%.
 * Note:Attributes/Fields must be non-Private for the above classes.
 * A class Test is given to you with the main method.Use this class to test your solution.
 * is 
 * */
package com.nt;

public class Employee {
   int id;
   String name;
   double basicSalary;
   double HRAPer;
   double DAPer;
   
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

   public double calculateGrossSalary() {
	 return basicSalary+HRAPer+DAPer;  
   }
}

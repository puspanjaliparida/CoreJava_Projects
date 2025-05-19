package com.nt;

public class TestClassEmp {
   public static void main(String[] args) {
	   TaxUtil t=new TaxUtil();
	   
	   Employee e1=new Employee();
	   e1.setBasicSalary(3000.0);
	   e1.setHRAPer(12.0);
	   e1.setDAPer(4.0);
	   e1.setId(101);
	   e1.setName("Ramesh");
	   double tax = t.calculatedTax(e1);
	   System.out.println("Tax of "+e1.getId()+" Employee "+e1.getName()+" is : " + tax);
	   
	   Manager m1=new Manager();
	   m1.setBasicSalary(30000.0);
	   m1.setHRAPer(30.0);
	   m1.setDAPer(40.0);
	   m1.setProjectAllowance(20.0);
	   m1.setId(102);
	   m1.setName("Khushi");
	   double tax1=t.calculatedTax(m1);
	   System.out.println("Tax of "+m1.getId()+" Manager "+m1.getName()+" is: "+tax1);
	   
	   Trainer t1=new Trainer();
	   t1.setBasicSalary(40000.0);
	   t1.setBatchCount(5);
	   t1.setDAPer(30.0);
	   t1.setHRAPer(40.0);
	   t1.setPerkPerBatch(4);
	   t1.setId(103);
	   t1.setName("Omm");
	   double tax2=t.calculatedTax(t1);
	   System.out.println("Tax of "+t1.getId()+" Trainer "+t1.getName()+" is: "+tax2);
	   
	   Sourcing s1=new Sourcing();
	   s1.setBasicSalary(50000.0);
	   s1.setDAPer(30.0);
	   s1.setEnrollmentReached(4);
	   s1.setEnrollmentTarget(10);
	   s1.setHRAPer(40.0);
	   s1.setPeakPerEnrollment(2);
	   s1.setId(104);
	   s1.setName("Mama");
	   double tax3=t.calculatedTax(s1);
	   System.out.println("Tax of "+s1.getId()+" Sourcing "+s1.getName()+" is: "+tax3);
   }
}

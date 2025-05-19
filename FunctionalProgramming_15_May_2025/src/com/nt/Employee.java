package com.nt;

class Employee {
   private int empno;
   private String name;
   private int deptno;
   private double salary;
   private String job;
   
   public Employee(int empno, String name, int deptno, double salary, String job) {
	  this.empno = empno;
	  this.name = name;
	  this.deptno = deptno;
	  this.salary = salary;
	  this.job = job;
   }

   public int getEmpno() {
	 return empno;
   }

   public void setEmpno(int empno) {
	this.empno = empno;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public int getDeptno() {
	return deptno;
   }

   public void setDeptno(int deptno) {
	this.deptno = deptno;
   }

   public double getSalary() {
	return salary;
   }

   public void setSalary(double salary) {
	this.salary = salary;
   }

   public String getJob() {
	return job;
   }

   public void setJob(String job) {
	this.job = job;
   }

   @Override
   public String toString() {
	 return "Employee [empno=" + empno + ", name=" + name + ", deptno=" + deptno + ", salary=" + salary + ", job=" + job
			+ "]";
   } 
}

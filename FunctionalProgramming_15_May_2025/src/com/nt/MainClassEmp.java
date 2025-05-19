package com.nt;

import java.util.ArrayList;
import java.util.function.Predicate;

public class MainClassEmp {
   public static void displayIf(ArrayList<Employee> e,Predicate<Employee> p) {
	   for(Employee emp:e) {
		   if(p.test(emp)) {
			   System.out.println(emp);
		   }
	   }
   }
    
   public static void main(String[] args) {
	   ArrayList<Employee> emps=new ArrayList<Employee>();
	   Employee khushi=new Employee(101, "Khushi", 10, 100000.0, "Manager");
	   Employee omm=new Employee(102, "Omm", 20, 20000.0, "Developer");
	   Employee mama=new Employee(103, "Mama", 30, 50000.0, "HR");
	   Employee bablu=new Employee(104, "Bablu", 10, 900000.0, "CEO");
	   
	   emps.add(khushi);
	   emps.add(omm);
	   emps.add(mama);
	   emps.add(bablu);
	   
	   //System.out.println(emps);
	   displayIf(emps,(e)->e.getSalary()>10000.0);
	   displayIf(emps,(e)->e.getDeptno()==10);
	   displayIf(emps,(e)->e.getJob().equalsIgnoreCase("HR"));
   }
}
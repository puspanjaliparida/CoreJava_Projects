package com.nt;
class EmployeeTester{
       public static void main(String[] args) {
    	  Employee emp=new Employee();
    	  System.out.println("The Employee Details Are::");
    	  emp.setEmployeeName("Khushi");
    	  emp.setDepartment("Manager");
    	  emp.setPerformanceScore(9);
    	  emp.setBaseSalary(60000.00);
    	 
    	  System.out.println("The employee name is "+emp.getEmployeeName());
    	  System.out.println("The employee department is "+emp.getDepartment());
    	  System.out.println("The baseSalary of the employee is "+emp.getBaseSalary());
    	  System.out.println("The bonus of the employee is "+emp.calculateBonus());
       }
}

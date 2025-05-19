/*Smart HR Automation System
----------------------------------------------------
Your company is building a Smart HR System that:
- Filters eligible employees for bonuses.
- Calculates bonuses based on their ratings.
- Notifies them with custom messages.
- Generates congratulatory messages using suppliers.

Expected Output:
Notification Sent: Anjali, congratulations! You’ve received a bonus of ₹8000.0
Notification Sent: Rohit, congratulations! You’ve received a bonus of ₹7500.0
Neha is not eligible for a bonus.
Kiran is not eligible for a bonus.
HR SYSTEM: Bonus processing completed!
*/
package com.nt;

import java.util.*;
import java.util.function.*;

class Employee1 {
	int empno;
    String name;
    double salary;
    int rating;

    Employee1(int empno,String name, double salary, int rating) {
    	this.empno=empno;
    	this.name = name;
        this.salary = salary;
        this.rating = rating;
    }
}
public class SmartHRAutomationSystem {
	public static void main(String[] args) {
        ArrayList<Employee1> emps=new ArrayList<Employee1>();
		Employee1 Anjali=new Employee1(101,"Anjali", 80000, 5);
		Employee1 Rohit=new Employee1(102,"Rohit", 75000, 6);
		Employee1 Neha=new Employee1(103,"Neha", 60000, 3);
		Employee1 Kiran=new Employee1(104,"Kiran", 50000, 3);
        
		emps.add(Anjali);
		emps.add(Rohit);
		emps.add(Neha);
		emps.add(Kiran);
		
		//- Filters eligible employees for bonuses.
        Predicate<Employee1> isEligible = emp -> emp.rating >= 4;

        //- Calculates bonuses based on their ratings.
        Function<Employee1, Double> calculateBonus = emp -> emp.salary * 0.10;

        //- Notifies them with custom messages.
        Consumer<String> notify = message -> System.out.println("Notification Sent: " + message);

        //- Generates congratulatory messages using suppliers.
        Supplier<String> hrFinalMessage = () -> "HR SYSTEM: Bonus processing completed!";

        for (Employee1 emp : emps) {
            if (isEligible.test(emp)) {
                double bonus = calculateBonus.apply(emp);
                String message = emp.name + ", congratulations! You’ve received a bonus of ₹" + bonus;
                notify.accept(message);
            } else {
                System.out.println(emp.name + " is not eligible for a bonus.");
            }
        }
        System.out.println(hrFinalMessage.get());
    }
}

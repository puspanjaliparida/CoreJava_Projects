/*Q5)AdvancedArithmetic

Create an interface AdvancedArithmetic which contains a method signature as:-
public abstract int divisorSum(int n).
Then write a class called MyCalculator which implements the interface AdvancedArithmetic.
divisorSum function just takes an integer as input and return the sum of all its
divisors.
For example divisors of 6 are 1,2,3 and 6, so divisorSum should return 12.
Sample Input
6
Sample Output
12

Explanation
Divisors of 6 are 1,2,3 and 6. 1+2+3+6=12.
A class Testing is given to you with a main method.
Use this class to test your solution's classes and meth

ods.*/
package com.nt;

public interface IAdvancedArithmetic {

	public abstract int divisorSum(int n);
}


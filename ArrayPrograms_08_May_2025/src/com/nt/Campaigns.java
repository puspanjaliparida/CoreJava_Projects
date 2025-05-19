/*Q8. Two promotional campaigns store the customer 
 *    IDs who participated. Find the intersection
 *    of both campaigns to determine which customers 
 *    qualified for double rewards.
      E.g., A = campaign1 customers, B = campaign2 customers, T = qualified customers.*/
package com.nt;

public class Campaigns {
    public static void main(String[] args) {
		String A[]= {"A1","A2","B3","B5","A4"};
		String B[]= {"B1","B3","A1","B4","B5"};
		String T[]=new String[5];
		int index = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i].equals(B[j])) {
                    boolean isDuplicate = false;
                    for (int k = 0; k < index; k++) {
                        if (T[k].equals(A[i])) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        T[index] = A[i];
                        index++;
                    }
                }
            }
        }
        System.out.println("Qualified customers for double rewards:");
        for (int i = 0; i < index; i++) {
            System.out.println(T[i]);
        }
    }
}

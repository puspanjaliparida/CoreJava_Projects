/*Q11) In a product catalog, an OutDated product ID needs to be replaced
       with a new product ID throughout the system.
       Create a method that replaces every occurrence of oldElement with newElement.
       Example Input:
       int[] productIds = {10, 20, 30, 20, 40};
       modifyArrayElement(productIds, 20, 25);
       Expected Output:
       Modified Array: 10 25 30 25 40
 * */
package com.nt;

public class ProductCatalog {

    public static void modifyArrayElement(int[] arr, int oldElement, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }

        // Display the modified array
        System.out.print("Modified Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] productIds = {10, 20, 30, 20, 40};
        modifyArrayElement(productIds, 20, 25);
    }
}



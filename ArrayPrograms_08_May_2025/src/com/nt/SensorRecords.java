/*Q7. A sensor records 10 readings per cycle. To reduce storage,
 *    we want to compress the data by adding pairs of consecutive 
 *    readings and store them in a smaller array
      of size 5. Display the compressed result.*/
package com.nt;

public class SensorRecords {
    public static void main(String[] args) {
		int arr[]= {10,15,20,25,30,35,40,45,50,55};
		int compressedArray[]=new int[5];
		
		for (int i = 0; i < 5; i++) {
            compressedArray[i] = arr[2 * i] + arr[2 * i + 1];
        }
		System.out.println("Compressed Sensor Data:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Adding pairs of consecutive readings" +(i+1)+ ": " +compressedArray[i]);
        }
	}
}


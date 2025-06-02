/*Question.1)
write a java program to rotate an array in the right direction.
you have to take one class name as RotateArrayRighttDirection and take one static 
method as : public  static int[] righttShift(int[]arr,int numberOfRotation ){return arr;}
inside main method you have to take one array and take one local varial which hold  number of rotation.
after that you need to call  rightShift(int[]arr,int numberOfRotation  ); that will return array element.
and print your results.

Example 1: input int[]arr={1,2,3,4,5} and int numberOfRotation=1;
           Output    arr ={5,1,2,3,4}

Example 2: input int[]arr={1,2,3,4,5} and int numberOfRotation=3;
           Output    arr ={3,4,5,1,2};*/
package com.nt;

public class RotateArrayRightDirection {
    public static int[] rightShift(int[] arr,int numberOfRotation) {
    	int n=arr.length;
        numberOfRotation=numberOfRotation%n;
        
        int[] result=new int[n];
        int index=0;
        
        for(int i=n-numberOfRotation;i<n;i++) {
        	result[index++]=arr[i];
        }
        
        for(int i=0;i<n-numberOfRotation;i++) {
        	result[index++]=arr[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		int numberOfRotation=3;
		
		int[] rotatedArr=rightShift(arr,numberOfRotation);
		
		System.out.println("Output: ");
		for(int i=0;i<rotatedArr.length;i++) {
			System.out.println(rotatedArr[i]+ " ");
		}
	}
}

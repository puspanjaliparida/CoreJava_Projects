/*Question.3)
write a java program to rotate an array in the left direction.
you have to take one class name as RotateArrayLeftDirection and take one static 
method as : public  static int[] leftShift(int[]arr,int numberOfRotation ){return arr;}
inside main method you have to take one array and take one local varial which hold  number of rotation.
after that you need to call  leftShift(int[]arr,int numberOfRotation  ); that will return array element.
and print your results.

Example 1: input int[]arr={1,2,3,4,5} and int numberOfRotation=1;
           Output    arr ={2,3,4,5,1}

Example 2: input int[]arr={1,2,3,4,5} and int numberOfRotation=3;
           Output    arr ={4,5,1,2,3};

*/
package com.nt;

public class RotateArrayLeftDirection {
    public static int[] leftShift(int[] arr, int numberOfRotation) {
        int n = arr.length;
        numberOfRotation = numberOfRotation % n;

        int[] result = new int[n];
        int index = 0;

        for (int i = numberOfRotation; i < n; i++) {
            result[index++] = arr[i];
        }

        for (int i = 0; i < numberOfRotation; i++) {
            result[index++] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int numberOfRotation = 3;   

        int[] rotatedArr = leftShift(arr, numberOfRotation);
        System.out.println("Input:arr={1, 2, 3, 4, 5}");
        System.out.print("Output: ");
        for (int i = 0; i < rotatedArr.length; i++) {
            System.out.print(rotatedArr[i] + " ");
        }
    }
}


package org.example.basic1.exercise082;

import java.util.Arrays;

public class Exercise082 {
    public static void main(String[] args){

        int theLargestElement = findTheLargestElement();
    }
    public static int findTheLargestElement(){
        int[] arrayNumber = {10, 15, 30, 45, 64};
        System.out.println("Original Array: " + Arrays.toString(arrayNumber));
        int maximumValue = arrayNumber[0];
        if(maximumValue <= arrayNumber[arrayNumber.length - 1]){
            maximumValue = arrayNumber[arrayNumber.length - 1];
        }
        if(maximumValue <= arrayNumber[arrayNumber.length / 2]){
            maximumValue = arrayNumber[arrayNumber.length / 2];
        }
        System.out.println("Largest element between first, last, and middle values: " + maximumValue);
        return 0;
    }
}

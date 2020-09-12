package org.example.basic1.exercise081;

import java.util.Arrays;

public class Exercise081 {
    public static void main(String[] args){
        int swapElements = swapElements();
    }
    public static int swapElements(){
        int[] arrayNumbers = {10,15,20};
        System.out.println("Original array: " + Arrays.toString(arrayNumbers));
        int x = arrayNumbers[0];
        arrayNumbers[0] = arrayNumbers[arrayNumbers.length - 1];
        arrayNumbers[arrayNumbers.length - 1] = x;
        System.out.println("New array after swaping the first and last elements: "+ Arrays.toString(arrayNumbers));
        return 0;
    }

}

package org.example.basic1.exercise079;

import java.util.Arrays;

public class Exercise079 {
    public static void main(String[] args){
        int rotateArray = rotateArray();
    }
    public static int rotateArray(){
        int[] arrayNumber = {10,15,20};
        System.out.println("Original Array: " + Arrays.toString(arrayNumber));
        int[] newArrayNumber = {arrayNumber[1],arrayNumber[2],arrayNumber[0]};
        System.out.println("Rotated Array: " + Arrays.toString(newArrayNumber));
        return 0;
    }
}

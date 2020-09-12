package org.example.basic1.exercise080;

import java.util.Arrays;

public class Exercise080 {
    public static void main(String[] args){
        int changeFirstOrLastElement = changeFirstOrLastElement();
    }
    public static  int changeFirstOrLastElement() {
        int[] arrayNumbers = {10, 15, 20};
        System.out.println("Original Array: " + Arrays.toString(arrayNumbers));
        int maximumValue = arrayNumbers[0];
        if (arrayNumbers[2] >= maximumValue) {
            maximumValue = arrayNumbers[2];
        }
        System.out.println("Large value between first and last elements: " + maximumValue);
        return 0;
    }
}

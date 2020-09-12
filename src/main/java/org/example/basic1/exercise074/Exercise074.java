package org.example.basic1.exercise074;

import java.util.Arrays;

public class Exercise074 {
    public static void main(String[] args){
        int verificationArray = verificationArray();
    }
    public static int verificationArray(){
        int[] arrayNumbers = {10,-50,34,26,12,10};
        System.out.println("Original Array: " + Arrays.toString(arrayNumbers));
        if(arrayNumbers[0] == 10 || arrayNumbers[5] == 10){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        return 0;
    }
}

package org.example.basic1.exercise078;

import java.util.Arrays;

public class Exercise078 {
    public static void main(String[] args){
        int testArray = testArray();
    }
    public static int testArray(){
        int[] arrayNumber = {4,14};
        System.out.println("Original Array: " + Arrays.toString(arrayNumber));
        if(arrayNumber[0] == 4 || arrayNumber[0] == 7){
            System.out.println("True");
        }else if(arrayNumber[1] == 4 || arrayNumber[1] == 7){
            System.out.println("False");
        }
        return 0;
    }

}

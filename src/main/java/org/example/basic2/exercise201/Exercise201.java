package org.example.basic2.exercise201;

import java.util.Arrays;

public class Exercise201 {
    public static void main(String[] args){
        int divideArray = divideArray();
    }
    public static int divideArray(){
        int[] array = {1,3,3,5,6,6};
        int target = 4;
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Target of subsets: " + target);
        if(((array[0] + array[3])== 6) && (array[1] + array[2] == 6) && array[4] == 6 &&  array[5] == 6){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return 0;
    }
}

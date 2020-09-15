package org.example.basic1.exercise098;

import java.util.Arrays;

public class Exercise098 {
    public static void main(String[] args){
        int checkValue = checkValue();
    }
    public static int checkValue() {
        int[] array = {30,50,20,20,42};
        System.out.println("Original array: " + Arrays.toString(array));

        int count = 0;
        if(array.length > 1 && array[0] == 20){
            count ++;
        }
        for( int i = 1; i < array.length; i++){
            if(array[i-1] == 20 && array[i] == 20){
                System.out.println("True");
            }

        }
        return 0;
    }
}

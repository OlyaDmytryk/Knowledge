package org.example.basic1.exercise096;

import java.util.Arrays;

public class Exercise096 {
    public static void main(String[] args){
        int checkNumbers = checkNumbers();
    }
    public static int checkNumbers() {
        int[] array = {10,54,23,76,20,45};
        System.out.println("Origin array: " + Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            if(array[i] == 10) {
                System.out.println("True");
            }
            if(array[i] == 20){
                System.out.println("True");
            }
        }
        return 0;
    }
}

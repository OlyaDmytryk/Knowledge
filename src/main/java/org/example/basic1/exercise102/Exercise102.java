package org.example.basic1.exercise102;

import java.util.Arrays;

public class Exercise102 {
    public static void main(String[] args){
        int checkNumber = checkNumber();
    }
    public static int checkNumber(){
        int[] array = {11,45,89,24, 30,10,23};
        System.out.println("Original array: " + Arrays.toString(array));
        for(int i = 0; i < array.length; i++){
            if(array[i] == 10 || array[i] == 30){
                System.out.println("True");
            }
        }
        return 0;
    }

}

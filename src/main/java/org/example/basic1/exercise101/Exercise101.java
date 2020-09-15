package org.example.basic1.exercise101;

import java.util.Arrays;

public class Exercise101 {
    public static void main(String[] args){
        int checkOfNumber = checkOfNumber();
    }
    public static int checkOfNumber(){
        int[] array = {10,45,23,10,34,20,54};
        System.out.println("Original array:" + Arrays.toString(array));
        int numberFist = 0;
        int numberSecond = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 10){
                numberFist++;
            }
            if(array[i] == 20){
                numberSecond++;
            }
        }
        if(numberFist > numberSecond){
            System.out.println("True");
        }
        return 0;
    }
}

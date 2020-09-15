package org.example.basic1.exercise104;

import java.util.Arrays;

public class Exercise104 {
    public static void main(String[] args){
        int newArray = createNewArray();
    }
    public static int createNewArray(){
        int[] array = {25,23,54,14,10,26,54};
        System.out.println("Origin array: " + Arrays.toString(array));
        int j = 0;
        while(array[j] != 10){
            j++;
        }
        int[] newArray = new int[j];
        for(int i = 0; i < j; i++){
            newArray[i] = array[i];
        }
        System.out.println("New array: " + Arrays.toString(newArray));
        return 0;
    }
}

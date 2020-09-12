package org.example.basic1.exercise077;

import java.util.Arrays;

public class Exercise077 {
    public static void main(String[] args) {
        int changElementsBetweenArrays = changElementsBetweenArrays();
    }
    public static int changElementsBetweenArrays(){
        int[] arrayFirst = {10,15,20};
        int[] arraySecond = {12,18,26};
        System.out.println("First array: " + Arrays.toString(arrayFirst));
        System.out.println("Second array: " + Arrays.toString(arraySecond));
        int[] newArray = {arrayFirst[0] , arraySecond[2]};
        System.out.println("New array: " + Arrays.toString(newArray));
        return 0;
    }
}

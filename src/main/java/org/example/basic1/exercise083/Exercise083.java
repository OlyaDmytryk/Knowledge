package org.example.basic1.exercise083;

import java.util.Arrays;

public class Exercise083 {
    public static void main(String[] args){
        int multiplyCorrespondingElements = multiplyCorrespondingElements();
    }
    public static int multiplyCorrespondingElements(){
        String result = "";
        int[] arrayFirst = {1,20,-9,23,56};
        int[] arraySecond = {2,53,-5,-33,2};
        System.out.println("First array: " + Arrays.toString(arrayFirst));
        System.out.println("Second array: " + Arrays.toString(arraySecond));
        for(int i = 0; i < arrayFirst.length; i++){
            int numberArrayFirst = arrayFirst[i];
            int numberArraySecond = arraySecond[i];
            result += Integer.toString(numberArrayFirst * numberArraySecond) + " ";
        }
        System.out.println("\nResult: " + result);
        return 0;
    }
}

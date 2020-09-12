package org.example.basic1.exercise076;

import java.util.Arrays;

public class Exercise076 {
    public static void  main (String[] args){
        int testTwoArrays = testTwoArrays();
    }
    public static int testTwoArrays(){
        int[] arrayFirst = {10,15,20,25};
        int[] arraySecond = {10,30,45,25};
        System.out.println("First array: " + Arrays.toString(arrayFirst));
        System.out.println("Second array: " + Arrays.toString(arraySecond));
        if(arrayFirst[0] == arraySecond[0] && arraySecond[3] == arrayFirst[3]){
            System.out.println("True");
        }
        return 0;
    }
}

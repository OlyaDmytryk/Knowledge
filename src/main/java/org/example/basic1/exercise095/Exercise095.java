package org.example.basic1.exercise095;


import java.util.Arrays;

public class Exercise095 {
    public static void main(String[] args){
        int stringValues = createOfStringValues();
    }
    public static int createOfStringValues(){
        int n = 7;
        String[] array = new String[n];

        for(int i = 0; i < n; i++)
            array[i] = String.valueOf(i);
        System.out.println("New Array: "+Arrays.toString(array));
        return 0;
    }
}

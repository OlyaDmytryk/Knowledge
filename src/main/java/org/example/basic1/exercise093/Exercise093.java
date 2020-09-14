package org.example.basic1.exercise093;

import java.util.Arrays;

public class Exercise093 {
    public static void main(String[] args){
        int containsElement = containsElement();
    }
    public static int containsElement() {
        int[] numbers = {10,10,23,54,20,20};
        System.out.println("Original array: " + Arrays.toString(numbers));
        for(int i = 0; i < numbers.length - 1; i++){
            if((numbers[i] == 10 && numbers[i+1] == 10) || (numbers[i] == 20 && numbers[i+1] == 20)){
                System.out.println("True");
            }
        }
        return 0;
    }
}

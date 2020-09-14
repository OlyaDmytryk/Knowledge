package org.example.basic1.exercise094;

import java.util.Arrays;

public class Exercise094 {
    public static void main(String[] args){
        int oddOrEvenNumbers = oddOrEvenNumbers();
    }
    public static int oddOrEvenNumbers(){
        int[] numbers = {1,3,6,4,5,13,2};
        int i = 0;
        System.out.println("Original array: " + Arrays.toString(numbers));
        while(i < numbers.length &&  numbers[i] % 2 == 0) {
            i++;
        }
        for (int j = i + 1; j < numbers.length; j++) {
            if ( numbers[j] % 2 != 0) {
                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
                i++;
            }
        }
        System.out.println("New Array: "+Arrays.toString(numbers));
        return 0;
    }
}

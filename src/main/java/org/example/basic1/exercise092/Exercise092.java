package org.example.basic1.exercise092;

import java.util.Arrays;

public class Exercise092 {
    public static void main(String[] args){
        int countNumberOfEverOrOddElements = countNumberOfEverOrOddElements();
    }
    public static int countNumberOfEverOrOddElements() {
        int[] numbers = {2,5,6,9,11,13,18,24};
        int evenNumbers = 0;
        int oddNumbers = 0;
        System.out.println("Original Array: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evenNumbers++;
            }
            else {
                oddNumbers++;
            }
        }
        System.out.printf("\nNumber of even elements in the array: %d",evenNumbers);
        System.out.printf("\nNumber of odd elements in the array: %d",oddNumbers);
        return 0;
    }
}

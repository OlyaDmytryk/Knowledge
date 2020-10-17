package org.example.basic2.exercise203;

import java.util.Arrays;

public class Exercise203 {
    public static void main(String[] args) {
        int result = result();
    }
    public static int result(){
        int[] array = {4,2,3,3,7,2,4};
        int value = 3;
        System.out.print("Original Array: "+Arrays.toString(array));
        System.out.print("\nValue of k: "+value);
        System.out.print("\nMaximum average value: "+ findAverage(array, value));
        return 0;
    }
    public static double findAverage(int[] array, int value) {
        int sum = 0;
        for (int i = 0; i < value; i++) {
            sum += array[i];
        }
        int maximumAverage = sum;

        for (int i = value; i < array.length; i++) {
            sum = sum - array[i - value] + array[i];
            maximumAverage = Math.max(maximumAverage, sum);
        }
        return (double) maximumAverage / value;
    }
}

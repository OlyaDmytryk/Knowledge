package org.example.basic2.exercise176;

import java.util.Arrays;

public class Exercise176 {
    public static void main(String[] args) {
        int[] array = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
        System.out.println("Original array: " + Arrays.toString(array));
        int[] result = newArray(array);
        System.out.println("After partition the said array becomes: " + Arrays.toString(result));
    }

    public static int[] newArray(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            while (array[i] % 2 == 0) {
                i++;
            }
            while (array[j] % 2 != 0) {
                j--;
            }
            if (i < j) {
                int temporary = array[i];
                array[i] = array[j];
                array[j] = temporary;
            }
        }
        return array;
    }
}

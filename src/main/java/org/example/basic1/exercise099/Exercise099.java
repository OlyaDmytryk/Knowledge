package org.example.basic1.exercise099;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Arrays;

public class Exercise099 {
    public static void main(String[] args) {
        int checkArray = checkArray();
    }
    public static int checkArray() {
        int[] array = {10,15,10,23};
        System.out.println("Original array: " + Arrays.toString(array));
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] == 10 && array[i+1] != 10){
                System.out.println("True");
            }
        }
        return 0;
    }
}

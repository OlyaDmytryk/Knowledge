package org.example.basic2.exercise202;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise202 {
    public static void main(String[] args) {
        int output = output();
    }
    public static int output(){
        int[] array = {4, 2, 3, 3, 7, 2, 4};
        int value = 6;
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Value number : " + value);
        System.out.println("Total number of continuous subarrays: " +arrayFunction(array,value));
        return 0;
    }
    private static int arrayFunction(int[] array, int value){
       int number = 0;
       int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            if(map.containsKey(sum - value)){
                number = number + map.get(sum - value);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum) + 1);
            }else {
                map.put(sum,1);
            }
        }
       return number;
    }
}

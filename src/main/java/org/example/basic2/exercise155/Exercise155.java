package org.example.basic2.exercise155;

import java.util.Arrays;

public class Exercise155 {
    public static void main(String[] args){
        int changeTheRowsAndColumns = changeTheRowsAndColumns();
    }
    public static int changeTheRowsAndColumns(){
        int[][] array = {
                        {10, 20, 30},
                         {40, 50, 60}
        };
        System.out.print("Original array: \n" + Arrays.deepToString(array));
        System.out.println("\n After changing the rows and columns of the said array: ");
        int [][] newArray = new int [array[0].length][array.length];
        for(int i =0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                newArray[j][i] = array[i][j];
            }
        }
        printArray(newArray);
        return 0;
    }
    private static  void printArray(int[][] array){
        for(int i =0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++){
                System.out.println(array[i][j] );
            }
        }
    }

}

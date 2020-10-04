package org.example.basic2.exercise154;

public class Exercise154 {
    public static void main (String[] args){
        int printContentsInTheArray = printContentsInTheArray();

    }
    public static int  printContentsInTheArray() {
        boolean[][] array = {{true, false, true},
                            {false, true, false}};
        int rowsOfLength = array.length;
        int columnsOfLength = array[0].length;

        for(int i = 0; i < rowsOfLength; i++){
            for(int j = 0; j < columnsOfLength; j++){
                if(array[i][j]){
                    System.out.print("t");
                }else {
                    System.out.print("f");
                }
            }
            System.out.println();
        }
        return 0;
    }
}

package org.example.basic1.exercise097;

public class Exercise097 {
    public static void main(String[] args){
        int containsSpecifiedNumber = containsSpecifiedNumber();
    }
    public static int containsSpecifiedNumber() {
        int[] array = {40, 45, 40, 30, 20, 19, 25};

        int result = 0;

        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] == 40 && array[i+1] == 40)
            {
                System.out.printf( "True");
                result = 1 ;
            }

            if(i <= array.length - 3 && array[i] == 40 && array[i+2] == 40)
            {
                System.out.printf( "True");
                result = 1 ;
            }
        }
        return 0;
    }
}

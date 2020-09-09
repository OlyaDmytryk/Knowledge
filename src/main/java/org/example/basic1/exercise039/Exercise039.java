package org.example.basic1.exercise039;

public class Exercise039 {
    public static void main(String[] args){
        int uniqueNumber = uniqueNumber();
    }
    public static int uniqueNumber(){
        int count = 0;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <=4; j++){
                for (int k = 1; k <=4; k++){
                    if( i != j && i!= k && j != k){
                        count ++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + count);
        return count;
    }
}

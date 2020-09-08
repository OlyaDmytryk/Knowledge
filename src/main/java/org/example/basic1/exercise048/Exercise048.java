package org.example.basic1.exercise048;

public class Exercise048 {
    public static void main(String[] args){
        int oddNumbers = oddNumbers();
    }
    public static int oddNumbers() {
        for(int i = 1; i <= 99; i++){
            if(i % 2 == 1){
                System.out.println(i + ",");
            }
        }
        return 0;
    }
}

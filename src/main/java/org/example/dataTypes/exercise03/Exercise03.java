package org.example.dataTypes.exercise03;

public class Exercise03 {
    public static void main(String[] args){
        int addAllDigits = addAllDigits();
    }
    public static int addAllDigits(){
        int integer = 565;
        System.out.println("Integer between 0 and 1000:  " + integer);
        int fistNumber = integer % 10;
        int remainingNumber = integer / 10;
        int secondNumber = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdNumber = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthNumber = remainingNumber % 10;
        int sum = fistNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.println("The  sum of all digits " + sum);
        return 0;
    }
}

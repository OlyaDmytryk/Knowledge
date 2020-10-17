package org.example.dataTypes.exercise10;

public class Exercise10 {
    public static void main(String[] args){
        int breakNumber = breakNumber();
    }
    public static int breakNumber(){
        int digits = 123456;
        System.out.println("Six non-negative digits: " + digits);
        int firstNumber = digits / 100000 % 10;
        int secondNumber = digits / 10000 % 10;
        int thirdNumber = digits / 1000 % 10;
        int fourthNumber = digits / 100 % 10;
        int fifthNumber = digits / 10 % 10;
        int sixthNumber = digits % 10;
        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber + " " + fourthNumber + " " + fifthNumber + " " + sixthNumber);
        return 0;
    }
}

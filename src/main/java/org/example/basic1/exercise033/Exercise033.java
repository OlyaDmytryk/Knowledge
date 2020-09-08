package org.example.basic1.exercise033;
import  java.util.Scanner;

public class Exercise033 {
    public static void main (String[] args){
        int sumOfDigitsOfInteger = sumOfDigitsOfInteger();
    }
    public static int sumOfDigitsOfInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        int remainder = 0;
        int sum = 0;

        while(number > 0){
            remainder = number % 10;
            sum = sum + remainder;
            number = number / 10;
        }
        System.out.println("Sum: " + sum);
        return sum;
    }
}

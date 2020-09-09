package org.example.basic1.exercise018;
import java.util.Scanner;

public class Exercise018 {
    public static void main(String[] args) {
        int multipleTwoNumber = multipleTwoNumber();
        int binaryNumber = binaryNumber(5,7);
    }
    public static int multipleTwoNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first binary number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the second binary number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();

        int multiply = 0;
        int number = 1;
        int factor = 1;

        while (firstNumber != 0){
            number = secondNumber % 10;
            if(number == 1){
                firstNumber = firstNumber * factor;
                multiply = binaryNumber(firstNumber, multiply);
            }
            else{
                firstNumber = firstNumber * factor;
            }
            secondNumber = secondNumber / 10;
            factor = 10;
        }
        System.out.println("Product of binary numbers: " + multiply);
        return  multiply;
    }
    public static int binaryNumber(int firstNumber, int secondNumber) {
        int i = 0;
        int remainder = 0;
        int result = 0;
        int [] sum = new int[30];
        while (firstNumber != 0 || secondNumber != 0){
            sum[i++] = (firstNumber % 10 + secondNumber % 10 + remainder) % 2;
            remainder = (firstNumber % 10 + secondNumber % 10 + remainder) / 2;
            firstNumber = firstNumber / 10;
            secondNumber = secondNumber / 10;
        }
        if(remainder != 0){
            sum[i++] = remainder;
        }
        --i;
        while(i >= 0){
            result = result * 10 + sum[i--];
        }
        return result;
    }
}


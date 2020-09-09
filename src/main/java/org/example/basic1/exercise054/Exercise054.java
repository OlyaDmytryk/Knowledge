package org.example.basic1.exercise054;

import java.util.Scanner;

public class Exercise054 {
    public static void main (String[] args){
        double twoNumbers = twoNumbers();
    }
    public static double twoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Input the third number : ");
        int thirdNumber = scanner.nextInt();
        if((firstNumber % 10 == secondNumber % 10) || (firstNumber % 10 == thirdNumber % 10) || (secondNumber % 10 == thirdNumber % 10)){
            System.out.println("The result is: true");
        }
        return 0;
    }
}


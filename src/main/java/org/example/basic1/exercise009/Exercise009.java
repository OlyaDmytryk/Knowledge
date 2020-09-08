package org.example.basic1.exercise009;
import java.util.Scanner;

public class Exercise009 {
    public static void main (String[] args){
        float resultOfOperation = resultOfOperation();
    }
    public static float resultOfOperation() {
        System.out.println("((firstNumber * secondNumber - secondNumber * secondNumber) / (thirdNumber - fourthNumber))");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter second number");
        float secondNumber = scanner.nextFloat();
        System.out.println("Enter third number");
        float thirdNumber = scanner.nextFloat();
        System.out.println("Enter fourth number");
        float fourthNumber = scanner.nextFloat();
        scanner.close();
        float result = ((firstNumber * secondNumber - secondNumber * secondNumber) / (thirdNumber - fourthNumber));
        System.out.println("Result: " + result);
        return 0;
    }
}

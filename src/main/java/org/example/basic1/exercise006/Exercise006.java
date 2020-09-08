package org.example.basic1.exercise006;
import java.util.Scanner;

public class Exercise006 {
    public static void main (String[] args){
        int mathOperation = mathOperation();
    }
    public static int mathOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number");
        int secondNumber = scanner.nextInt();
        scanner.close();
        int sum = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;
        System.out.println("Result\n" + "Sum "+ sum + "\nSubtraction " + subtraction + "\nMultiplication " + multiplication + "\nDivision " + division + "\nRemainder " + remainder);
        return 0;
    }
}

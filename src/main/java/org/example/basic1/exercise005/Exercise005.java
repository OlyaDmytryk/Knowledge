package org.example.basic1.exercise005;
import java.util.Scanner;

public class Exercise005 {
    public static void main (String[] args){
        int multiplication = multiplication();
    }
    public static int multiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number");
        int secondNumber = scanner.nextInt();
        scanner.close();
        int multiplication = firstNumber * secondNumber;
        System.out.println("Results " + multiplication);
        return multiplication;
    }
}

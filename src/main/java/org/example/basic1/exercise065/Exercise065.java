package org.example.basic1.exercise065;
import java.util.Scanner;

public class Exercise065 {
    public static void main(String[] args) {
        int modulesOfTwoNumbers = modulesOfTwoNumbers();
    }
    public static int modulesOfTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number :");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the second number :");
        int secondNumber = scanner.nextInt();
        int divided = firstNumber / secondNumber;
        int module = firstNumber - (divided * secondNumber);
        System.out.println("Result:" + module);
        return module;
    }
}

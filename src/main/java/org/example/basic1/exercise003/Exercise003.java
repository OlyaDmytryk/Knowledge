package org.example.basic1.exercise003;
import java.util.Scanner;

public class Exercise003 {
    public static void main (String[] args){
        int divideOfResult = divideOfResult();
    }
    public static int divideOfResult(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        int result = firstNumber / secondNumber;
        scanner.close();
        System.out.println("Divide of result " + result);
        return result;
    }
}

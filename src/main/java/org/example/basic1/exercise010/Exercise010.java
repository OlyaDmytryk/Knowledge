package org.example.basic1.exercise010;
import java.util.Scanner;

public class Exercise010 {
    public static void main(String[] args){
        float resultOfOperation = resultOfOperation();
    }
    public static float resultOfOperation() {
        System.out.println("firstNumber * (secondNumber - (thirdNumber/fourthNumber) + (thirdNumber/fifthNumber) - (thirdNumber/sixthNumber) + (thirdNumber/seventhNumber) - (thirdNumber/eighthNumber))");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstNumber");
        float firstNumber = scanner.nextFloat();
        System.out.println("Enter secondNumber");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter thirdNumber");
        float thirdNumber = scanner.nextFloat();
        System.out.println("Enter fourthNumber");
        int fourthNumber = scanner.nextInt();
        System.out.println("Enter fifthNumber");
        int fifthNumber = scanner.nextInt();
        System.out.println("Enter sixthNumber");
        int sixthNumber = scanner.nextInt();
        System.out.println("Enter seventhNumber");
        int seventhNumber = scanner.nextInt();
        System.out.println("Enter eighthNumber");
        int eighthNumber = scanner.nextInt();
        scanner.close();
        float result = firstNumber * (secondNumber - (thirdNumber/fourthNumber) + (thirdNumber/fifthNumber) - (thirdNumber/sixthNumber) + (thirdNumber/seventhNumber) - (thirdNumber/eighthNumber));
        System.out.println("Result: " + result);
        return result;
    }
}

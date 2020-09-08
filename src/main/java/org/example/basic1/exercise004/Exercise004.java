package org.example.basic1.exercise004;

import java.util.Scanner;

public class Exercise004 {
    public static void main (String[] args){
        int resultOfOperation = resultOfOperation();
    }
    public static int resultOfOperation() {
        System.out.println("a) - firstNumber + secondNumber * thirdNumber");
        System.out.println("b) (firstNumber + secondNumber) % thirdNumber");
        System.out.println("c) firstNumber + (-secondNumber* thirdNumber) / fourthNumber");
        System.out.println("d) firstNumber + secondNumber / thirdNumber* fourthNumber");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter fourth number");
        int fourthNumber = scanner.nextInt();
        scanner.close();
        int resultA = - firstNumber + secondNumber * thirdNumber;
        int resultB = (firstNumber + secondNumber) % thirdNumber;
        int resultC = firstNumber + (-secondNumber * thirdNumber) / fourthNumber;
        int resultD = firstNumber + secondNumber / thirdNumber * fourthNumber;
        System.out.println("Result");

        System.out.println("a) " + resultA +"b) " + resultB+ "c) " + resultC +"d) " +resultD);
        return 0;
    }
}

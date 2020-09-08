package org.example.basic1.exercise052;
import java.util.Scanner;

public class Exercise052 {
    public static void main(String[] args){
        int sumOfTwoInteger = sumOfTwoInteger();
    }
    public static int sumOfTwoInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input the third number: ");
        int thirdNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        if(sum == thirdNumber){
            System.out.println("The result is:  true");
        }
        return 0;
    }
}

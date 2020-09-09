package org.example.basic1.exercise062;
import java.util.Scanner;

public class Exercise062 {
    public static void main(String[] args){
        int returnNumbers = returnNumbers();
    }
    public static int returnNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Input the third number: ");
        int thirdNumber = scanner.nextInt();
        scanner.close();
        int subtraction = secondNumber - thirdNumber;
        if( firstNumber >= 20 & firstNumber < subtraction){
            System.out.println("Result: true ");
        }else {
            System.out.println("Result: false");
        }
        return  0;
    }
}

package org.example.basic1.exercise063;
import java.util.Scanner;

public class Exercise063 {
    public static void  main(String[] args){
        int acceptValue = acceptValue();
    }
    public static  int acceptValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input the second number: ");
        int secondNumber = scanner.nextInt();
        if(firstNumber == secondNumber){
            System.out.println("Result: " + 0);
        }else if (firstNumber % 6 == secondNumber % 6){
            if(firstNumber < secondNumber) {
                System.out.println("Result: " + firstNumber);
            }else{
                System.out.println("Result: " + secondNumber);
            }
        }else if(firstNumber > secondNumber){
            System.out.println("Result: " + firstNumber);
        }else {
            System.out.println("Result: " + secondNumber);
        }
        return 0;
    }
}

package org.example.basic1.exercise064;
import java.util.Scanner;

public class Exercise064 {
    public static void main (String[] args){
        int commonDigit = commonDigit();
    }
    public static int commonDigit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number: ");
        int secondNumber = scanner.nextInt();
        scanner.close();
        int i = 25;

        if( i < 75){
            int numberFirst = firstNumber % 10;
            int numberSecond = secondNumber % 10;
            firstNumber = firstNumber / 10;
            secondNumber = secondNumber / 10;
            if ((firstNumber == secondNumber || firstNumber == numberSecond || numberFirst == secondNumber || numberFirst == numberSecond )){
                System.out.println("Result: true");
            }
        }
        return 0;
    }
}

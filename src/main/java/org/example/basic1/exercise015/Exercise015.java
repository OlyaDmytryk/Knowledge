package org.example.basic1.exercise015;
import java.util.Scanner;

public class Exercise015 {
    public static void main (String[] args) {
        int swapOfNumber = swapOfNumber();
    }
    public static int swapOfNumber (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number before swap: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number before swap: ");
        int secondNumber =scanner.nextInt();
        scanner.close();
        int temp;
        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;
        System.out.println("First number after swap: " + firstNumber);
        System.out.println("Second number after swap: " + temp);
        return 0;
    }
}

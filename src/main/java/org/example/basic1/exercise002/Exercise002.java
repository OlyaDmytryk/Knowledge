package org.example.basic1.exercise002;
import java.util.Scanner;

public class Exercise002 {
    public static void main (String[] args){
        int sumOfNumbers = sumOfNumbers();
    }
    public static int sumOfNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int numberFirst = scanner.nextInt();
        System.out.println("Enter second number");
        int numberSecond = scanner.nextInt();
        scanner.close();
        int sum = numberFirst + numberSecond;
        System.out.println("Sum = " + sum);
        return sum;
    }
}

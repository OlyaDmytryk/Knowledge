package org.example.basic1.exercise012;
import java.util.Scanner;

public class Exercise012 {
    public static void main (String[] args){
        float averageOfNumbers = averageOfNumbers();
    }
    public static float averageOfNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        float first_number = scanner.nextFloat();
        System.out.println("Enter second number: ");
        float second_number =scanner.nextFloat();
        System.out.println("Enter three number: ");
        float three_number = scanner.nextFloat();
        scanner.close();
        float average = (first_number + second_number + three_number) / 3;
        System.out.println("Average " + average);
        return average;
    }
}

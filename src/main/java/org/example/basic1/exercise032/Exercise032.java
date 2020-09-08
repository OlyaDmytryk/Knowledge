package org.example.basic1.exercise032;
import java.util.Scanner;

public class Exercise032 {
    public static void main(String[] args){
        int compareTwoNumbers = compareTwoNumbers();
    }
    public static int compareTwoNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first integer: ");
        int firstInteger = scanner.nextInt();
        System.out.println("Input second integer: ");
        int secondInteger = scanner.nextInt();
        scanner.close();
        if(firstInteger != secondInteger){
            System.out.printf("%d != %d\n", firstInteger ,secondInteger);
        }else {
            System.out.printf("%d == %d\n", firstInteger,secondInteger);
        }
        if(firstInteger < secondInteger){
            System.out.printf("%d < %d\n", firstInteger,secondInteger);
        }else if(firstInteger <= secondInteger){
            System.out.printf("%d <= %d", firstInteger, secondInteger);
        }
        return 0;
    }
}

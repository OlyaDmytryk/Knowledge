package org.example.basic1.exercise022;
import java.util.Scanner;

public class Exercise022 {
    public static void main (String[] args){
        int convertToDecimalNumber = convertToDecimalNumber();
    }
    public static int convertToDecimalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a binary number: ");
        String binaryNumber = scanner.nextLine();
        scanner.close();
        System.out.println("" + Integer.parseInt(binaryNumber,2));
        return 0;
    }
}

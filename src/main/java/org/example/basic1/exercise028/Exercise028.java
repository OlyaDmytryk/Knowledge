package org.example.basic1.exercise028;
import java.util.Scanner;

public class Exercise028 {
    public static void main(String[] args){
        int convertToDecimalNumber = convertToDecimalNumber();
    }
    public static int convertToDecimalNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a hexadecimal number: ");
        int hexadecimalNumber = Integer.parseInt(scanner.nextLine(), 16);
        scanner.close();
        System.out.println("Equivalent decimal number: " + hexadecimalNumber);
        return hexadecimalNumber;
    }
}

package org.example.basic1.exercise020;
import java.util.Scanner;

public class Exercise020 {
    public static void main(String[] args){
        int convertToHexadecimalNumber = convertToHexadecimalNumber();
    }
    public static int convertToHexadecimalNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a decimal number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();
        String hexadecimalNumber = Integer.toHexString(decimalNumber);
        System.out.println("Hexadecimal number is : " + hexadecimalNumber);
        return 0;
    }
}

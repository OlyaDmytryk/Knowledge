package org.example.basic1.exercise023;
import java.util.Scanner;

public class Exercise023 {
    public static void main(String[] args){
        int convertToHexadecimalNumber = convertToHexadecimalNumber();
    }
    public static int convertToHexadecimalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Binary number: ");
        int binaryNumber = Integer.parseInt(scanner.nextLine(), 2);
        scanner.close();
        String hexadecimalNumber = Integer.toHexString(binaryNumber);
        System.out.println("HexaDecimal value: " + hexadecimalNumber);
        return 0;
    }
}

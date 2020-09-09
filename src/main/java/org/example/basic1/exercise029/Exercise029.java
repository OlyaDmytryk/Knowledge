package org.example.basic1.exercise029;
import java.util.Scanner;

public class Exercise029 {
    public static void main(String[] args){
        int convertToBinaryNumber = convertToBinaryNumber();
    }
    public static int convertToBinaryNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Hexadecimal number: ");
        int hexadecimalNumber = Integer.parseInt(scanner.nextLine(), 16);
        scanner.close();
        String binaryNumber = Integer.toBinaryString(hexadecimalNumber);
        System.out.println("Equivalent Binary Number: " + binaryNumber);
        return 0;

    }
}

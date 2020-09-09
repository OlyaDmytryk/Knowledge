package org.example.basic1.exercise026;
import java.util.Scanner;

public class Exercise026 {
    public static void main(String[] args){
        int convertToBinaryNumber = convertToBinaryNumber();
    }
    public static int convertToBinaryNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any octal number: ");
        int octalNumber = Integer.parseInt(scanner.nextLine(), 8);
        scanner.close();
        String binaryNumber = Integer.toBinaryString(octalNumber);
        System.out.println("Equivalent binary number: " + binaryNumber);
        return 0;
    }
}

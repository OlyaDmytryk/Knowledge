package org.example.basic1.exercise024;
import java.util.Scanner;

public class Exercise024 {
    public static void main(String[] args){
        int convertOctalNumber = convertOctalNumber();
    }
    public static int convertOctalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Binary number: ");
        int binaryNumber = Integer.parseInt(scanner.nextLine(), 2);
        scanner.close();
        String octalNumber = Integer.toHexString(binaryNumber);
        System.out.println("Octal number: " + octalNumber);
        return 0;
    }
}

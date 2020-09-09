package org.example.basic1.exercise030;
import java.util.Scanner;

public class Exercise030 {
    public static void main(String[] args){
        int convertToOctalNumber = convertToOctalNumber();
    }
    public static int convertToOctalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a hexadecimal number: ");
        int hexadecimalNumber = Integer.parseInt(scanner.nextLine(), 16);
        scanner.close();
        String octalNumber = Integer.toOctalString(hexadecimalNumber);
        System.out.println("Equivalent of octal number: " + octalNumber);
        return 0;
    }
}

package org.example.basic1.exercise025;
import java.util.Scanner;

public class Exercise025 {
    public static void main(String[] args){
        int convertToDecimalNumber = convertToDecimalNumber();
    }
    public static int convertToDecimalNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any octal number:");
        int octalNumber = Integer.parseInt(scanner.nextLine(), 8);
        scanner.close();
        System.out.println("Equivalent decimal number: " + octalNumber);
        return  octalNumber;
    }
}

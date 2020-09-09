package org.example.basic1.exercise021;
import java.util.Scanner;

public class Exercise021 {
    public static  void main (String[] args){
        int convertToOctalNumber = convertToOctalNumber();
    }
    public static  int convertToOctalNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("Octal number is: " + octalNumber);
        return 0;
    }
}

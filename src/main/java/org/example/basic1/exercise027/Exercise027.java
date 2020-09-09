package org.example.basic1.exercise027;
import java.util.Scanner;

public class Exercise027 {
    public static void main(String[] args){
        int octalToHexadecimalNumber = octalToHexadecimalNumber();
    }
    public static int octalToHexadecimalNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a octal number: ");
        int octalNumber = Integer.parseInt(scanner.nextLine(),8);
        String hexadecimalNumber = Integer.toHexString(octalNumber);
        System.out.println("Equivalent hexadecimal number: " + hexadecimalNumber);
        return 0;
    }
}

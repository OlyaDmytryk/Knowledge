package org.example.basic1.exercise037;
import java.util.Scanner;

public class Exercise037 {
    public static void main(String[] args){
        int reverseString = reverseString();
    }
    public static int reverseString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string ");
        String originalString = scanner.nextLine();
        scanner.close();
        String reverseString = "";
        int length = originalString.length();
        for (int i = length - 1; i>=0; i--){
            reverseString = reverseString + originalString.charAt(i);
        }
        System.out.println("Reverse string: " + reverseString);
        return 0;
    }
}

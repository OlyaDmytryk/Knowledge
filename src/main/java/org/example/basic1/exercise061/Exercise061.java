package org.example.basic1.exercise061;
import java.util.Scanner;

public class Exercise061 {
    public static void main (String[] args){
        int reverseWord = reverseWord();
    }
    public static int reverseWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word ");
        String originalWord = scanner.nextLine();
        scanner.close();
        String reverseWord = "";
        int length = originalWord.length();
        for (int i = length - 1; i>=0; i--){
            reverseWord = reverseWord + originalWord.charAt(i);
        }
        System.out.println("Reverse string: " + reverseWord);
        return 0;
    }
}

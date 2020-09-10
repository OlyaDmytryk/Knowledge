package org.example.basic1.exercise071;
import  java.util.Scanner;

public class Exercise071 {
    public static void main(String[] args){
        int concatenationTwoStrings = concatenationTwoStrings();
    }
    public static int concatenationTwoStrings(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a first word : ");
        String firstWord = scanner.nextLine();
        System.out.println("input a second word: ");
        String secondWord = scanner.nextLine();
        System.out.println(firstWord.substring(1) + secondWord.substring(1));
        return 0;
    }
}

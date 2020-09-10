package org.example.basic1.exercise073;
import  java.util.Scanner;

public class Exercise073 {
    public static void main(String[] args){
        int string = createString();
    }
    public static int createString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a word: ");
        String word = scanner.nextLine();
        String string = "";

        int lengthWord = string.length();
        String result = "";
        result += (word.length() >= 1) ? word.charAt(0) : '#';
        result += (lengthWord >= 1) ? string.charAt(lengthWord-1) : '#';
        System.out.println(result);
        return 0;
    }


}

package org.example.basic1.exercise059;
import java.util.Scanner;

public class Exercise059 {
    public static void main(String[] args){
        int lowercaseLetters = lowercaseLetters();
    }
    public static int lowercaseLetters (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String: ");
        String string = scanner.nextLine();
        scanner.close();
        string = string.toLowerCase();
        System.out.println(string);
        return  0;
    }
}

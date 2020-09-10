package org.example.basic1.exercise058;
import java.util.Scanner;

public class Exercise058 {
    public static  void main(String[] args){
        int capitalizeTheFirstLetter = capitalizeTheFirstLetter();
    }
    public static int capitalizeTheFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Sentence: ");
        String line = scanner.nextLine();
        String upperLetter = "";
        Scanner lineScan = new Scanner(line);
        while(lineScan.hasNext()) {
            String word = lineScan.next();
            upperLetter += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(upperLetter.trim());
        return 0;
    }
}

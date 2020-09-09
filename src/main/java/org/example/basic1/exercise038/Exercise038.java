package org.example.basic1.exercise038;
import java.util.Scanner;

public class Exercise038 {
    public static void main(String[] args){
        countSymbols();
    }
    public static int countSymbols() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The string is: ");
        String string = scanner.nextLine();
        int letter =0;
        int space = 0;
        int digit = 0;
        int other =0;
        char array[] = string.toCharArray();
        for (int i = 0; i < string.length(); i++){
            if(Character.isLetter(array[i])){
                letter++;
            }else if (Character.isSpaceChar(array[i])){
                space++;
            }else if(Character.isDigit(array[i])){
                digit++;
            }else{
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + digit);
        System.out.println("other: " + other);
        return 0;
    }
}

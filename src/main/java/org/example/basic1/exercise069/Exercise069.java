package org.example.basic1.exercise069;
import java.util.Scanner;

public class Exercise069 {
    public static void main(String[] args){
        int extractString = extractString();
    }
    public static int extractString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String string = scanner.nextLine();
        System.out.println(string.substring(0,string.length()/2));
        return 0;
    }
}

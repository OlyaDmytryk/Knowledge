package org.example.basic1.exercise041;
import java.util.Scanner;

public class Exercise041 {
    public static void main(String[] args){
        int asciiValue = asciiOfValue();
    }
    public static int asciiOfValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the ASCII character : ");
        char value = scanner.next().charAt(0);
        int asciiValue = value;
        System.out.println("The ASCII value of"+ value + "is: " + asciiValue );
        scanner.close();
        return value;
    }
}

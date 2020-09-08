package org.example.basic1.exercise044;
import java.util.Scanner;

public class Exercise044 {
    public static void main(String[] args){
        int valueInteger = valueInteger();
    }
    public static int valueInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int value = scanner.nextInt();
        scanner.close();
        System.out.printf("%d + %d%d + %d%d%d\n",value,value,value,value,value,value);
        return value;
    }
}

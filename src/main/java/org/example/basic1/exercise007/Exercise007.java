package org.example.basic1.exercise007;
import java.util.Scanner;

public class Exercise007 {
    public static void main (String[] args){
        int multiplicationOfTable = multiplicationOfTable();
    }
    public static int multiplicationOfTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int first_number = scanner.nextInt();
        for(int i = 0; i <= 9; i++) {
            String result = first_number + "*"+ (i+1) + "="+ (first_number * (i+1));
            System.out.println("Result " + result);
        }
        scanner.close();
        return 0;
    }
}

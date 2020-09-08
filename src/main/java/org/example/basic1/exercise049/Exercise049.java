package org.example.basic1.exercise049;
import java.util.Scanner;

public class Exercise049 {
    public static void main(String[] args){
        int checkOfNumber = checkOfNumber();
    }
    public static int checkOfNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if(number % 2 == 0){
            System.out.println(1);
        }else if(number % 2 == 1){
            System.out.println(0);
        }
        return number;
    }
}

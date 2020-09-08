package org.example.basic1.exercise053;
import java.util.Scanner;

public class Exercise053 {
    public static void main(String[] args){
        int coincidence = coincidence();
    }
    public static int coincidence() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int numberFirst = scanner.nextInt();
        System.out.println("Input the second number: ");
        int numberSecond = scanner.nextInt();
        System.out.println("Input the third number: ");
        int numberThird = scanner.nextInt();
        if(numberFirst < numberSecond){
            if(numberSecond < numberThird){
                System.out.println("The result is : true");
            }
        }
        return 0;
    }
}

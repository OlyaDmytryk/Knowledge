package org.example.basic2.exercise153;
import java.util.Scanner;
public class Exercise153 {
    public static void main(String[] args){
        int checkNumber = checkNumber();
    }
    public static int checkNumber() {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("First Number: ");
        double firstNumber = scanner.nextDouble();
        System.out.println("Second number: ");
        double secondNumber = scanner.nextDouble();
        if(firstNumber > 0 && firstNumber < 1 && secondNumber > 0 && secondNumber < 1){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        return 0;
    }

}

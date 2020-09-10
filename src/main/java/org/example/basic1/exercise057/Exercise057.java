package org.example.basic1.exercise057;
import java.util.Scanner;

public class Exercise057 {
    public static  void main(String[] args){
        int countTheFactors = countTheFactors();
    }
    public static  int countTheFactors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int integerNumber = scanner.nextInt();
        System.out.print("Factors of " + integerNumber + " are: ");
        for (int i = 1; i <= integerNumber; ++i) {
            if (integerNumber % i == 0) {
                System.out.print(i + " ");
            }
        }
        return integerNumber;
    }
}

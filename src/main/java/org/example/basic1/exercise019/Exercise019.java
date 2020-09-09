package org.example.basic1.exercise019;
import  java.util.Scanner;

public class Exercise019 {
    public static  void main(String[] args) {
        int convertNumber = convertNumber();
    }
    public static  int convertNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a Decimal Number: ");
        int decimalNumber = scanner.nextInt();
        scanner.close();

        int[] binaryNumber = new int[30];
        int i = 0;
        while(decimalNumber > 0) {
            binaryNumber[i] = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            i++;
        }
        for(int j = i - 1; j >= 0; j--){
            System.out.print(binaryNumber[j]);
        }
        return 0;
    }
}

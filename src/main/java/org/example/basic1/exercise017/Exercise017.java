package org.example.basic1.exercise017;
import java.util.Scanner;

public class Exercise017 {
    public static void main(String[] args) {
        int addBinaryNumbers = addBinaryNumbers();
    }
    public static int addBinaryNumbers() {
        int i = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        int numberFirst = scanner.nextInt();
        System.out.print("Input second binary number: ");
        int numberSecond = scanner.nextInt();

        while (numberFirst != 0 || numberSecond != 0) {
            sum[i++] = (int) ((numberFirst % 10 + numberSecond % 10 + remainder) % 2);
            remainder = (int) ((numberFirst % 10 + numberSecond % 10 + remainder) / 2);
            numberFirst = numberFirst / 10;
            numberSecond = numberSecond / 10;
        }
        if (remainder != 0) {
            sum[i++] = remainder;
        }
        --i;
        System.out.print("Sum of two binary numbers: ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        scanner.close();
        return 0;
    }
}
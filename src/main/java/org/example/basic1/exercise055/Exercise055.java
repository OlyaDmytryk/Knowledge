package org.example.basic1.exercise055;
import java.util.Scanner;

public class Exercise055 {
    public static void main(String[] args){
        int stringToInteger = convertSecondsToHour();
    }
    public static int convertSecondsToHour() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();
        int a = seconds % 60;
        int hours = seconds / 60;
        int minutes = hours % 60;
        hours = hours / 60;
        System.out.print( hours + ":" + minutes + ":" + a);
        scanner.close();
        return 0;
    }
}

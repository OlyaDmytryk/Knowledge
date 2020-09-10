package org.example.basic1.exercise086;
import java.util.Scanner;

public class Exercise086 {
    public  static void main(String[] args){
        int integerNumber = integerNumber();
    }
    public static int integerNumber(){
        int ctr = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = scanner.nextInt();


        while (number != 1){
            System.out.println(number);
            if(number % 2 == 0){
                number = number / 2;
               ctr += 1;
            }else {
                number = (number * 3 + 1) / 2;
               ctr += 1;
            }
        }
        System.out.println(number);
        scanner.close();
        return 0;
    }
}

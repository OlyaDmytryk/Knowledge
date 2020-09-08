package org.example.basic1.exercise001;
import java.util.Scanner;

public class Exercise001 {
    public static void main (System [] args) {
        String introduction = introduction();
    }
    public static String introduction(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        scanner.close();
        System.out.println("Hello\n"+ name);
        return name;
    }
}

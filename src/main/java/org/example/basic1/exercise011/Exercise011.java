package org.example.basic1.exercise011;
import java.util.Scanner;

public class Exercise011 {
    public static void main (String[] args){
        double circle = circle();
    }
    public static double circle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        scanner.close();
        System.out.println("Perimeter = " + perimeter );
        System.out.println("Area = " + area );
        return 0;
    }
}

package org.example.basic1.exercise013;
import java.util.Scanner;

public class Exercise013 {
    public static void main (String[] args){
        float rectangle = rectangle();
    }
    public static float rectangle() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter width of a rectangle");
        float width = scanner.nextFloat();
        System.out.println("Enter height of a rectangle");
        float height = scanner.nextFloat();
        scanner.close();
        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
        return 0;
    }
}

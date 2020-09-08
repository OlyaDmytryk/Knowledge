package org.example.basic1.exercise034;
import java.util.Scanner;
public class Exercise034 {
    public static void main (String[] args){
        double areaOfHexagon = areaOfHexagon();
    }
    public static double areaOfHexagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of a hexagon = (6 * s^2)/(4*tan(π/6))");
        System.out.println("Input the length of a side of the hexagon: ");
        double length = scanner.nextDouble();
        scanner.close();
        double areaOfHexagon = (6 * (length*length))/(4*Math.tan(Math.PI/6));
        System.out.println("Length: " + length);
        System.out.println("Area: " + areaOfHexagon);
        return areaOfHexagon;
    }
}

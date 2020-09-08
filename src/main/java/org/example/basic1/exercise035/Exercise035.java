package org.example.basic1.exercise035;
import java.util.Scanner;

public class Exercise035 {
    public static void main(String[] args){
        double areaOfPolygon = areaOfPolygon();
    }
    public static double areaOfPolygon(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of a polygon = (n*s^2)/(4*tan(π/n))");
        System.out.println("Input the length of one of the sides: ");
        double length = scanner.nextDouble();
        System.out.println("Input the number of sides on the polygon: ");
        double numberOfSides = scanner.nextDouble();
        scanner.close();
        double areaOfPolygon = (numberOfSides*(length*length))/(4*Math.tan(Math.PI/numberOfSides));
        System.out.println("Length of one of the sides: " + length);
        System.out.println("Number of sides on the polygon: " + numberOfSides);
        System.out.println("The area is: " + areaOfPolygon);
        return areaOfPolygon;
    }
}

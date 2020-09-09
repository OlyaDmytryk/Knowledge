package org.example.basic1.exercise036;
import java.util.Scanner;

public class Exercise036 {
    public static void main(String[] args){
        int computeTheDistance = computeTheDistance();
    }
    public static int computeTheDistance(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))");
        System.out.println("Input the latitude of coordinate for first point: ");
        double latitudeFirst = scanner.nextDouble();
        System.out.println("Input the longitude of coordinate for first point: ");
        double longitudeFirst = scanner.nextDouble();
        System.out.println("Input the latitude of coordinate for second point: ");
        double latitudeSecond = scanner.nextDouble();
        System.out.println("Input the longitude of coordinate for second point: ");
        double longitudeSecond = scanner.nextDouble();

        double radius = 6371.01;
        double distance = radius * Math.acos(Math.sin(latitudeFirst) * Math.sin(latitudeSecond) + Math.cos(latitudeFirst) * Math.cos(latitudeSecond) * Math.cos(longitudeFirst - longitudeSecond));
        System.out.println("The distance between those points is: " + distance);
        scanner.close();
        return 0;
    }
}

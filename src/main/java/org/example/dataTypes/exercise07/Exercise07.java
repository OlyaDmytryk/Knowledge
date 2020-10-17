package org.example.dataTypes.exercise07;

public class Exercise07 {
    public static void main(String[] args){
        int distance = distance();
    }
    public static int distance(){
        double distanceInMeters = 250;
        int hour = 5;
        int minutes = 56;
        int seconds = 23;
        double time = 5 * 3600 + 56 * 60 + 23;
        System.out.println("1 mile = 1609 meters");
        System.out.println("Distance in meters: " + distanceInMeters);
        System.out.println("Hour: " + hour);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        System.out.println("Your speed in meters/seconds: " + distanceInMeters / time);
        System.out.println("Your speed in km/h: " + ((distanceInMeters / 1000) / (time / 3600)));
        return 0;
    }

}

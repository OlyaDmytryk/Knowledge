package org.example.dataTypes.exercise04;

public class Exercise04 {
    public static void main(String[] args){
        int convertMinutes = convertMinutes();
    }
    public static int convertMinutes() {
        int minutes = 3456789;
        System.out.println("Minutes : "  + minutes );

        int minutesInYear = 60 * 24 *365;
        int years = minutes  / minutesInYear;
        int days = (minutes / 60 / 24) % 365;
        System.out.println(minutes + " minutes is approximately " + years + " and " + days + " days.");
        return 0;

    }
}

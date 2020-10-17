package org.example.dataTypes.exercise02;

public class Exercise02 {
    public static void main(String[] args){
        int convertNumber = convertNumber();
    }
    public static int convertNumber() {
        double inch = 1000.0;
        System.out.println("One inch is 0.0254 meter");
        System.out.println("Value for inch: " + inch);
        double meters = inch * 0.0254;
        System.out.println(inch + "inch is " + meters + " meters");
        return 0;
    }
}

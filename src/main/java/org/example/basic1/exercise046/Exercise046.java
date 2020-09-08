package org.example.basic1.exercise046;

public class Exercise046 {
    public static void main (String[] args){
        double systemTime = systemTime();
    }
    public static double systemTime(){
        System.out.format("Current Date time %tc%n \n", System.currentTimeMillis());
        return 0;
    }
}

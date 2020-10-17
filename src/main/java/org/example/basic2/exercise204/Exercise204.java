package org.example.basic2.exercise204;

public class Exercise204 {
    public static void main(String[] args){
        int computeNumber = computeNumber();
    }
    public static int computeNumber(){
        int x = 25;
        int y = 45;
        int n = 35;
        double computeNumber = Math.pow(x,n);
        double result = computeNumber % y;
        System.out.println(result);
        return 0;
    }
}

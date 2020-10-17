package org.example.dataTypes.exercise06;

public class Exercise06 {
    public static void main(String[] args){
        int bodyIndex = bodyIndex();
    }
    public static int bodyIndex(){
        int weight = 64;
        double height = 1.65;
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        double index = weight / (height * height);
        System.out.println("Index:" + index);
        return 0;
    }
}

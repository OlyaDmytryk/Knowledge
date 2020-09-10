package org.example.basic1.exercise085;

public class Exercise085 {
    public static void main(String[] args){
        int checkString = checkString();
    }
    public static int checkString(){
        System.out.println("I want to sleep because I'm exhausted");
        String string = "I want to sleep because I'm exhausted";
        System.out.println(string.startsWith("want"));
        System.out.println(string.startsWith("I"));
        return 0;
    }
}

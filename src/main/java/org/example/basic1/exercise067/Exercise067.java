package org.example.basic1.exercise067;
import java.util.Scanner;

public class Exercise067 {
    public static void main(String[] args){
        int wordMiddle = wordMiddle();
    }
    public static int wordMiddle(){
        String main_string = "Python 3.0";
        String word = "Tutorial";
        System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));
        return 0;
    }
}

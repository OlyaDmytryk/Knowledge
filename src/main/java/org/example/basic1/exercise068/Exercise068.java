package org.example.basic1.exercise068;
import java.util.Scanner;

public class Exercise068 {
    public static void main(String[] args){
        int newString = createNewString();
    }
    public static int createNewString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java 5.0");
        String string = "Java 5.0";
        String threeCharacters =  string.substring(string.length()-3);
        System.out.println(threeCharacters + threeCharacters + threeCharacters + threeCharacters + threeCharacters);
        return 0;
    }
}

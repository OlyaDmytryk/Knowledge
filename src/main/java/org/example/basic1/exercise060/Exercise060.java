package org.example.basic1.exercise060;
import java.util.Scanner;

public class Exercise060 {
    public static void main(String[] args){
        int penultimateWord = penultimateWord();
    }
    public static int penultimateWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a String ");
        String string = scanner.nextLine();
        String[] words = string.split("[ ]+");
        System.out.println("Penultimate word: " + words[words.length - 2]);
        return 0;
    }
}

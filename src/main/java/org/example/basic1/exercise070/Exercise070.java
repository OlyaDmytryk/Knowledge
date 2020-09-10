package org.example.basic1.exercise070;
import java.util.Scanner;

public class Exercise070 {
     public static void main(String[] args){
         int string = createString();
     }
     public static int createString(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Input a first word: ");
         String firstWord = scanner.nextLine();
         System.out.println("Input a second word: ");
         String secondWord = scanner.nextLine();
         if(firstWord.length() >= secondWord.length()){
             System.out.println(secondWord + firstWord + secondWord);
         } else {
             System.out.println(firstWord + secondWord + firstWord);
         }
         return 0;
     }
}

package org.example.basic2.exercise181;

public class Exercise181 {
    public static void main(String[] args){
        int lastWord = lastWord();
    }
    public static int lastWord(){
        int lengthWord = 0;
        String string = "I want green apple";
        System.out.println("Original String: " + string);
        String[] word = string.split(" ");
        if(word.length > 0){
            lengthWord = word[word.length - 1].length();
            System.out.println("The length of last word: " + lengthWord);
        }else {
            lengthWord = 0;
        }
        return 0;
    }
}

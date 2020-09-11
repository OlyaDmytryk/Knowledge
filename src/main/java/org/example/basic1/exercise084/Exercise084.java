package org.example.basic1.exercise084;

public class Exercise084 {
    public static  void main(String[] args){
        int addThreeCharacters = addThreeCharacters();
    }
    public static int addThreeCharacters(){
        String string = "Java";
        int lengthString = 3;
        if(lengthString > string.length()){
            lengthString = string.length();
        }
        String partString = string.substring(string.length() - 3);
        System.out.println(partString + string + partString);
        return 0;
    }
}

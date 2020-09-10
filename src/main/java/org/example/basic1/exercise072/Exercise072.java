package org.example.basic1.exercise072;

public class Exercise072 {
    public static void main (String[] args){
        int string = createString();
    }
    public static int createString() {
        String string = "";
        int length = string.length();
        if (length >= 3) {
            System.out.println(string.substring(0, 3));
        } else if (length == 1) {
            System.out.println((string.charAt(0) + "##"));
        } else {
            System.out.println("###");
        }
        return 0;

    }
}

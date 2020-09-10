package org.example.basic1.exercise090;

public class Exercise090 {
    public static void main(String[] args){
        int environmentVariable = environmentVariable();
    }
    public static int environmentVariable(){
        System.out.println("\nEnvironment variable PATH: ");
        System.out.println(System.getenv("PATH"));
        System.out.println("\nEnvironment variable TEMP: ");
        System.out.println(System.getenv("TEMP"));
        System.out.println("\nEnvironment variable USERNAME: ");
        System.out.println(System.getenv("USERNAME"));
        return 0;
    }
}

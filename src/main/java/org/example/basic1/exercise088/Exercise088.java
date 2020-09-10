package org.example.basic1.exercise088;

public class Exercise088 {
        public static void main(String[] args){
            int currentSystem = currentSystem();
        }
        public static int currentSystem(){
            System.out.println("\nCurrent system environment:");
            System.out.println(System.getenv());
            System.out.println("\n\nCurrent system properties:");
            System.out.println(System.getProperties());
            return 0;
        }
}

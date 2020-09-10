package org.example.basic1.exercise089;

public class Exercise089 {
    public static void main(String[] args){
        int securityManager = securityManager();
    }
    public static int securityManager(){
        System.out.println("System security interface:");
        System.out.println(System.getSecurityManager());
        return 0;
    }
}

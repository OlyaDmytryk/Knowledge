package org.example.basic1.exercise031;

public class Exercise031 {
    public static void main(String[] args){
        int javaOfApplication = javaOfApplication();
    }
    public static int javaOfApplication() {
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
        return 0;
    }
}

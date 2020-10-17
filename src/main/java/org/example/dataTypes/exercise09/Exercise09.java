package org.example.dataTypes.exercise09;

public class Exercise09 {
    public static void main(String[] args){
        int informationOfNumber = informationOfNumber();
    }
    public static int informationOfNumber(){
        int firstNumber = 25;
        int secondNumber = 5;
        System.out.println("First integer: " + firstNumber);
        System.out.println("Second integer: " + secondNumber);
        System.out.println("Sum: " + (firstNumber + secondNumber));
        System.out.println("Difference: " + (firstNumber - secondNumber));
        System.out.println("Product: " + (firstNumber * secondNumber));
        System.out.println("Average: " + (firstNumber + secondNumber) / 2);
        System.out.println("Distance of two integers: " + (firstNumber - secondNumber));
        if(firstNumber > secondNumber){
            System.out.println("Max integer: " + firstNumber);
            System.out.println("Min integer: " + secondNumber);
        } else {
            System.out.println("Max integer: " + secondNumber);
            System.out.println("Min integer: " + firstNumber);
        }
        return 0;
    }
}

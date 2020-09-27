package org.example.basic2.exercise152;

public class Exercise152 {
    public static void main(String[] args) {
        int checkNumber = checkNumber();
    }
    public static  int checkNumber() {
        int firstNumber = 25;
        int secondNumber = 37;
        int thirdNumber = 45;
        int fourthNumber = 23;
        System.out.println("First number:" + firstNumber);
        System.out.println("Second number: " + secondNumber);
        System.out.println("Third number: " + thirdNumber);
        System.out.println("Fourth number: " + fourthNumber);
        if ((firstNumber == secondNumber) && (secondNumber == thirdNumber) && (thirdNumber == fourthNumber)){
            System.out.println("Numbers are equal");
        } else {
            System.out.println("Number are not equal");
        }
        return 0;
    }
}

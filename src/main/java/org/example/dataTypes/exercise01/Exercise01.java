package org.example.dataTypes.exercise01;

public class Exercise01 {
    public static void main(String[] args){
        int temperature = temperature();
    }
    public static int temperature(){
       double temperatureOfFahrenheit = 212.0;
       System.out.println("Degree in Fahrenheit: " + temperatureOfFahrenheit);
       double temperatureOfCelsius = (temperatureOfFahrenheit - 32) / 1.8;
       System.out.println(temperatureOfFahrenheit + "degree Fahrenheit is equal to " + temperatureOfCelsius + " in Celsius");
       return  0;
    }
}

package org.example.basic1.exercise075;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;

public class Exercise075 {
    public static void main(String[] args){
        int verificationElements = verificationElements();
    }
    public static int verificationElements(){
        int[] arrayNumbers = {10,15,5,45,10};
        System.out.println("Original Array: " + Arrays.toString(arrayNumbers));
        if(arrayNumbers[0] == arrayNumbers[4]){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
        return 0;
    }

}

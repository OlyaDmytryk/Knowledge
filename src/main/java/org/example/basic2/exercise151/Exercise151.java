package org.example.basic2.exercise151;

public class Exercise151 {
    public static void  main(String[] args){
        int ofValue = findOfValue();
    }
    public static int findOfValue() {
        System.out.println("a) (101 + 0) / 3");
        System.out.println("b) 3.0e-6 * 10000000.1");
        System.out.println("c) true && true");
        System.out.println("d) false && true");
        System.out.println("e) (false && false) || (true && true)");
        System.out.println("f) (false || false) && (true && true");
        int resultA = (101 + 0) / 3;
        double resultB = 3.0e-6 * 10000000.1;
        boolean resultC = true && true;
        boolean resultD = false && true;
        boolean resultE = (false && false) || (true && true);
        boolean resultF = (false || false) && (true && true);
        System.out.println("Expected Output: ");
        System.out.println("a) (101 + 0) / 3 -> " + resultA);
        System.out.println("b) 3.0e-6 * 10000000.1 -> " + resultB);
        System.out.println("c) true && true -> " + resultC);
        System.out.println("d) false && true -> " + resultD);
        System.out.println("e) (false && false) || (true && true) -> " + resultE);
        System.out.println("f) (false || false) && (true && true) -> " + resultF);
        return 0;
    }
}

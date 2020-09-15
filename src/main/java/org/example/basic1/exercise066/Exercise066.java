package org.example.basic1.exercise066;

public class Exercise066 {
    public static void main(String[] args){
        int computeTheSum = computeTheSum();
    }
    public static int computeTheSum() {
        int sum = 1;
        int ctr = 0;
        int n = 0;

        while (ctr < 100) {
            n++;
            if (n % 2 != 0) {
                if (is_Prime(n)) {
                    sum += n;
                }
            }
            ctr++;
        }
        System.out.println("\nSum of the prime numbers till 100: "+sum);
        return 0;
    }

    public static boolean is_Prime(int n) {
        for (int i = 3; i * i <= n; i+= 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}

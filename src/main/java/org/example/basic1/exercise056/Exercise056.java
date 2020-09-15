package org.example.basic1.exercise056;

public class Exercise056 {
    public static void main(String[] args) {
        int number = findNumber();
    }

    public static int findNumber() {
        int x = 18;
        int y = 24;
        int p = 3;
        int a = y / p - x / p + 1;
        if (x % p == 0){
            System.out.println(a);
        }
        return 0;
    }
}

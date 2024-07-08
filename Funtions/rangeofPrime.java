package Funtions;

import java.util.Scanner;

public class rangeofPrime {
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void range(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 20; // sc.nextInt();
        range(20);
        // System.out.println(prime);
    }
}

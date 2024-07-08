package Funtions;

import java.util.*;

public class factorial_n {
    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact_N = factorial(num);
        System.out.println(fact_N);
    }
}

package Funtions;

import java.util.Scanner;

public class binomial_coeff {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bino_coeff(int n, int r) {
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int n_r_fac = factorial(n - r);
        int binomial = n_fac / (r_fac * n_r_fac);
        return binomial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomial_coefficient = bino_coeff(n, r);
        System.out.println(binomial_coefficient);
    }
}

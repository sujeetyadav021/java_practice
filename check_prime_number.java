import java.util.Scanner;

public class check_prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true;
        // for (int i = 2; i <= n - 1; i++) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                isprime = false;
            }
        }
        if (isprime == true) {
            System.out.println("is a prime number");
        } else(isprime == false){
            System.out.println("not a prime number");
        }
    }
}

package Funtions;

public class even_number {
    public static boolean isEven(int n) {
        // boolean number = false;
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("number is even " + isEven(7));
    }
}

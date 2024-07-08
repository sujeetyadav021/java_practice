import java.util.*;
import java.util.Scanner;

public class simple_interest {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Principle: ");
            float Principle = s.nextFloat();
            System.out.print("Rate: ");
            float Rate = s.nextFloat();
            System.out.print("Time: ");
            float Time = s.nextFloat();
            float Simple_Interest = (Principle * Rate * Time) / 100;
            System.out.println(Simple_Interest);
        }
    }
}

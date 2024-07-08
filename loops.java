import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 0; i <= n; ++i) {
        // System.out.println(i);
        // }
        // int i = 1;
        // while (i <= n) {
        // System.out.println(i);
        // i++;

        // }
        // for (int i = 1; i <= n; i++) {
        // System.out.println(i);
        // }
        // int i = 1;
        // while (i <= n) {
        // System.out.println(i);
        // i++;
        // Sum of n all natuaral number
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

}

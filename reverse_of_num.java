import java.util.Scanner;

public class reverse_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (; i > 0; i /= 10) {
            int lastdigit = i % 10;
            System.out.print(lastdigit);
        }
        System.out.println();
    }
}

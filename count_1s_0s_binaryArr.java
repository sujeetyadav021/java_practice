import java.util.Scanner;

public class count_1s_0s_binaryArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count_1s = 0;
        int count_0s = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                count_1s++;
            }
            if (arr[i] == 0) {
                count_0s++;
            }
        }
        System.out.println(count_1s + " " + count_0s);
    }
}

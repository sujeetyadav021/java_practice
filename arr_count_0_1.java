import java.util.*;

public class arr_count_0_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count_one = 0;
        int count_zero = 0;
        for (int index = 0; index < n; index++) {
            if (arr[index] == 1) {
                // count_one = count_one + arr[index];
                count_one++;
            } else if (arr[index] == 0) {
                // count_zero = count_zero + arr[index];
                count_zero++;
            }
        }
        System.out.println(count_one);
        System.out.println(count_zero);
    }
}

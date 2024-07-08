import java.util.*;

public class sum_of_all_elements_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int index = 0; index < n; index++) {
            sum = sum + arr[index];
        }
        System.out.println(sum);

    }
}

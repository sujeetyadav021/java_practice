import java.util.*;

public class arr_linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {

            if (x == arr[i]) {
                found = true;
                break;

            }

        }
        System.out.println(found ? "Yes" : "No");
    }
}

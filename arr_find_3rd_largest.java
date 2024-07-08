import java.util.*;

public class arr_find_3rd_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int fmax = arr[0];
        int smax = arr[0];
        int tmax = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= fmax) {
                tmax = smax;
                smax = fmax;
                fmax = arr[i];
            } else if (arr[i] >= smax) {
                tmax = smax;
                smax = arr[i];
            } else if (arr[i] >= tmax) {
                tmax = arr[i];
            }
        }
        System.out.println(tmax);
    }
}

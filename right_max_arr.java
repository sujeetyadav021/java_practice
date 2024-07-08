import java.util.Scanner;

public class right_max_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // right_max_arr replace last element with -1
        // int max = -1;
        // for (int i = arr.length - 1; i >= 0; i--) {
        // int temp = arr[i];
        // arr[i] = max;
        // if (temp > max) {
        // max = temp;
        // }
        // System.out.println(arr[i] + " ");
        // }

        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = i + 1; j < n; j++) {
                if (max < arr[j])
                    max = arr[j];
            }
            // if (arr[i] > max)
            arr[i] = max;
            // arr[n - 1] = -1;
            System.out.print(arr[i] + " ");
        }
        // arr[n - 1] = -1;

    }
}

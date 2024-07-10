package TwoD_Array;

import java.util.Scanner;

public class Sum_of_rows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(arr.length);
        System.out.println(arr[0][0]);
        System.out.println(arr[1][0]);
        System.out.println(arr[2][1]);


        for (int i = 0; i < r; i++) {
            int sum_rows = 0;
            for (int j = 0; j < c; j++) {
                sum_rows += arr[i][j];
            }
            System.out.println(sum_rows);
        }
        // System.out.println(sum_rows);
    }
}

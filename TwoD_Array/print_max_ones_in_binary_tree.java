package TwoD_Array;

import java.util.Scanner;

public class print_max_ones_in_binary_tree {
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
        int max = -1;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < r; i++) {
            int count = 0;
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    result = i;
                }
            }
            // System.out.println(sum_rows);
        }
        System.out.println(result);
    }
}

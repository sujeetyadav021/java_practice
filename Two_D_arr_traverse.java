public class Two_D_arr_traverse {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 6, 7, 4 }, { 8, 9, 6 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[j][i] + " ");
            }
        }
    }
}

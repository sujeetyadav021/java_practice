package TwoD_Array;

public class One_Eighty_degree_rotation_matrix {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3 - 1; j <= 1; j--) {
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
    }
}

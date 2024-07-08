public class print_n_nums_not_present_in_arr {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 8, 9 };
        int n = 10;
        // for (int i = 1; i <= n; i++) {
        // boolean present = false;
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] == i) {
        // present = true;
        // break;
        // }
        // }
        // if (present == false) {
        // System.out.println(i + " ");
        // }
        // }
        boolean[] present = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            present[i] = false;
        }
        for (int j = 0; j < arr.length; j++) {
            int curr = arr[j];
            present[curr] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (present[i] == false) {
                System.out.print(i + " ");
            }
        }
    }
}

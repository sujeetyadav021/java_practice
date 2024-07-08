public class arrays_first {
    public static void main(String[] args) {
        // int n = 7;
        int[] arr = { 1, 2, -2, 4, 6, -9 };
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                sum = sum + arr[i];
                count++;

            }
        }
        System.out.println(sum + " " + count);

    }
}

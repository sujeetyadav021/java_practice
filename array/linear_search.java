package array;

public class linear_search {
    public static int linear(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 4, 6, 8, 10, 12, 16 };
        int key = 165;
        int search = linear(arr, key);
        if (search == -1) {
            System.out.println("number not found in array");
        } else {
            System.out.println("index is at " + search);
        }

    }
}

package array;

public class find_the_largest_num {
    public static int largest(int num[]) {
        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = { 82, 9, 2, 15, 3, 22 };
        int largest_num = largest(arr);
        System.err.println("Largest number is: " + largest_num);
    }
}

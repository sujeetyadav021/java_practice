import java.util.Scanner;

public class arr_using_user_inputs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        while (index < n) {
            System.out.print(arr[index]);
            index++;
        }
    }
}

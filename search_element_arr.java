import java.util.Scanner;

public class search_element_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("found");
                break;
            } else {
                System.out.println("not found");
                break;
            }
        }

    }
}

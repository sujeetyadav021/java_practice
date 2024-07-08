package Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class input_arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (list.get(i) == 5) {
                index = i;
            }
        }
        System.out.println(index);
    }
}

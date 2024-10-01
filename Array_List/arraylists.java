package Array_List;
import java.util.*;

class ArrayList {
    int[] arr;
    int capacity = 10;
    int size;

    ArrayList() {
        arr = new int[capacity];
        size = 0;
    }

    void add(int value) {
        if (size < 0.7 * capacity) {
            arr[size] = value;
        } else {
            capacity = 2 * capacity;
            int[] b = new int[capacity];
            for (int i = 0; i < size; i++)
                b[i] = arr[i];
            b[size] = value;
            arr = b;
        }
        size++;
    }

    void add(int index, int value) {
        if (size < 0.7 * capacity) {
            for (int i = size - 1; i >= index; i--) {
                arr[i + 1] = arr[i];
            }
        } else {
            capacity = 2 * capacity;
            int[] b = new int[capacity];
            for (int i = 0; i < size; i++)
                b[i] = arr[i];
            arr = b;

            for (int i = size - 1; i >= index; i--)
                arr[i + 1] = arr[i];
            arr[index] = value;
        }
        size++;
    }

    int get(int index) {
        if (index < size)
            return arr[index];
        return -1;
    }

    void set(int index, int value) {
        if (index < size) {
            arr[index] = value;
        }
    }

    // value is present in the list or not
    // return the value if it is present
    // remove the value if it is present
    void remove(int index) {
        for (int i = index; i < size; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    boolean isEmpty() {
        // if(size == 0)
        // return true;
        // else
        // return false;

        return size == 0;
    }

    int size() {
        return size;
    }
}

public class arraylists {

    public static void Main(String[] args) {
        ArrayList list = new ArrayList();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.add(3);
        list.add(5);
        list.add(7);
        list.print();

        list.add(1, 11);
        list.print();
        list.add(3, 17);
        list.print();
        list.remove(2);
        list.print();
    }
}
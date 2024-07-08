package Funtions;

public class avg_3_nums {
    public static int avg(int a, int b, int c) {
        int Average = (a + b + c) / 3;
        return Average;
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 15;
        int Avg = avg(x, y, z);
        System.out.println(Avg);
    }
}

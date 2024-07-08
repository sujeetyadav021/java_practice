import java.util.*;

public class billof3items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float cost = (pencil + pen + eraser);
        float tCost = cost + (cost * 0.18f);
        System.out.println(tCost);

    }
}

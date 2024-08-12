package recurssion;

public class Sum_of_1st_nuatural_n {
    public static int sum(int n){
        if(n==1)
        return 1;
        int sol = n + sum(n-1);
        return sol;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(sum(n));
    }
}

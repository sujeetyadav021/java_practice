package recurssion;

public class Print_1_n {

    public static void printInc(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        printInc(n);
    }
}

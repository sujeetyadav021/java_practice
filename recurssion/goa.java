package recurssion;

public class goa {
    public static void chalo(int n){
        
        if(n==0)
            return;
        else
            chalo(n-1);
            System.out.println("Goa");
    }
    public static void main(String[] args) {
        int num=15;
        chalo(5);
    }
}

package recurssion;


public class Print_n_to_1 {

    static void printDes(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDes(n-1);
    
    }
    public static void main(String[] args) {
        int n =10 ;
        printDes(n);
        // for(int i=n;i>=1;i--){
        //     System.out.print(i+" ");
        // }
        // System.out.println();
    }
}

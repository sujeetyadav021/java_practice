import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class factorial {
    
    // public static int fact(int num){
    //     int result =1 ;
    //     for(int i=1;i<=num;i++){
    //         result= result * i;
    //     }
    //     return result;
    // }
    public static int fact(int num){
        if(num==0)
        return 1;
        else
        return num * fact(num-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}

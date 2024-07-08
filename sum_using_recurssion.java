import java.util.Scanner;

public class sum_using_recurssion {
    public static int sum(int[] arr,int n){
        if(n==0)
        return arr[0];
        else 
        return sum(arr,n-1)+arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] array ={1,1,1,1,1};
        System.out.println(sum(array,num));
    }
}

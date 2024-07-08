package array;

import java.util.Scanner;

public class reverse_of_array {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println(arr[]);
       for(int i=n-1;i>=0;i--){
        System.out.print(arr[i]+" ");
       }
    
        
    }
}

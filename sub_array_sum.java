public class sub_array_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,8,9,7};
        int n=arr.length;
        
        for(int i = 0;i<n;i++){
          //  int sum =0;
            for (int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                  //  sum = sum+arr[k];
                   // System.out.print("=" + sum);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
                                                                                                  
public class maximumSubArraySum {
    public static void main(String[] args) {
        int[] array = {2,8,4,6,3,9,7,10,5,1};
        int a = maxSum(array);
        System.out.println(a);
    }
    public static int maxSum(int[] arr){
        int currSum=0;
        int mSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k =i;k<=j;k++){
                    currSum=currSum+arr[k];
                }
                System.out.println(currSum);
                if(currSum>mSum){
                    mSum=currSum;
                }
            }
            
        }
       // System.out.println(mSum);
       return mSum;
    }
}

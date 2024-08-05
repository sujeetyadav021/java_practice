public class Problem {
    public static void main(String args[]){
        //Given an array of intergers and an interger k, check if the array contains a pair(i,j) such that arr[i]+arr[j]=k
        int [] arr ={1,8,4,3,7,9};
        int k = 6;
        System.out.println(find(arr, k));
    }

     static boolean find(int[] arr, int k){
        int n = arr.length;

        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    return true;
                }
            }
            
        }
        return false;
    } 
}


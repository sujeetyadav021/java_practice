

public class binary {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int key = 4;
        int a=binarySearch(arr,key);
        System.out.println(a);
    }
    public static int binarySearch(int[] arr , int key){
       
        int l = 0;
        int h= arr.length-1;
        
        while (l<=h) {
            int mid= (l+h)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                l =mid +1;
            }
            else{
                h= mid-1;
            }
            
        }
        return -1;
    
    }
}

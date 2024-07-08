public class reverse_array_in_itself {
    public static void main(String[] args) {
        int[] arr={5,6,8,2,4,5,6,3,8};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last]= arr[first];
            arr[first]=temp;
            last--;
            first++;
        } 
    }
}

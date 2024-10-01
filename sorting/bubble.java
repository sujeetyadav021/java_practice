package sorting;

public class bubble {
    public static void main(String[] args) {
        int [] array = {5,2,4,3,1,8,6,5};
        printArr(array);
        //System.out.println(array.length);
        bubbleSort(array);
        printArr(array);
        


    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            for(int j = 0 ; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
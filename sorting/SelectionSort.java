package sorting;

public class SelectionSort {

    static void printArr(int[] array, int n){
        for(int i=0 ; i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        
    int[] arr = {6,2,9,12,1,3,5,4};
    int n = arr.length;
    printArr(arr,n);
    
// Selection Sort
    for(int i=0 ; i<n-1;i++){
        int minPos=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[minPos]){
                minPos=j;
            }
        }
        int temp = arr[minPos];
        arr[minPos]=arr[i];
        arr[i]=temp;
    }
    printArr(arr, n);

    }
}

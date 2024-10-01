package sorting;

public class insertionSort {
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
    
// Insertion Sort
    for(int i = 1;i<n;i++){
        int curr = arr[i];
        int prev = i-1;
        while (prev>=0 && arr[prev] > curr) {
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
    }
    printArr(arr, n);
    }
}
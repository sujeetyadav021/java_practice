package sorting;

import java.util.Arrays;

public class Merge_Array {
    // Given 2 sorted arrays, your task is to merge them together such that the resulting array is also sorted

    public static void main(String[] args) {
        int[] a={1,4,7,9,12};
        int[] b={2,5,6,8,15};
        System.out.println("a = " + Arrays.toString(a) + " b = " + Arrays.toString(b));
        int[] merged = merge(a, b);
        System.out.println("Merged array:");
        printArr(merged);

    }

    public static int[] merge(int[] arr1,int[]arr2){
        int[] temp=new int[arr1.length + arr2.length];
        int i=0;
        int j=0;
        int k =0;
        while(i<arr1.length && j<arr2.length ){
            if(arr1[i]<=arr2[j]){
                temp[k++]=arr1[i++];
            }
            else{
                temp[k++]=arr2[j++]; 
            }
        }
        // Copy any remaining elements from arr1
        while (i < arr1.length) {
            temp[k++] = arr1[i++];
        }

        // Copy any remaining elements from arr2
        while (j < arr2.length) {
            temp[k++] = arr2[j++];
        }
        return temp;
    }

    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

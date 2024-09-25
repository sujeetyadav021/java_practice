package java_practice;

/**
 * Two_pointer_ex
 */
public class Two_pointer_ex {

    
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1; // New length of the array without duplicates
    } 

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,5,5,6,7,9,9,9,10,10,11,20,30,30,30};
        int len = arr.length;
        System.out.println(len);
        int newLength = removeDuplicates(arr);  // Call function
        
        System.out.println("New length after removing duplicates: " + newLength);
        System.out.println("Array after removing duplicates:");
        
        // Print the array up to the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
    }
}
}
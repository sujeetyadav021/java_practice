package sorting;

public class array {
    public static void main(String[] args) {
        int[] arr={1,5,7,8,2,3,5,2,6,3};
        System.out.println(arr.length);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

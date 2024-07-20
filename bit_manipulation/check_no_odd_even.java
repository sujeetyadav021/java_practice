package bit_manipulation;

public class check_no_odd_even {

    public static void oddEven(int n){
        int bitMask=1;
        if((n & bitMask )== 0) {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddEven(5);
        oddEven(7);
    }
}

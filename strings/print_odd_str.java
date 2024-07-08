package strings;

public class print_odd_str {
    public static void main(String[] args) {
        String s="SujeetYadav";
        for(int i =0 ;i<s.length();i++){
            if(i%2!=0){
                System.out.print(s.charAt(i)+" ");
            }
        }
    }
}

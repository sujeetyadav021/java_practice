package strings;

public class string_palindrome_or_not {
    public static void main(String[] args) {
        String str = "anabna";
        System.out.println(checkpalindrome(str));
    }
    public static boolean checkpalindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
}

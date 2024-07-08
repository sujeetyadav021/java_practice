package strings;

public class str_uppercase_lowercase {
    
    public static String toLowerCase(String word){
        String res="";
        for(int i=0;i< word.length();i++){
            char ch = word.charAt(i);
            if(ch>='A' && ch <= 'Z'){
                char updatedChar = (char)(ch+32);
                res += updatedChar;
            }
            else{
                res += ch;
            }
        }
        return res;
    }

    public static String toUpperCase(String word){
        String res="";
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z'){
                char updatedChar = (char)(ch-32);
                res+=updatedChar;
            }
            else{
                res+=ch;
            }
        }
        return res;
    }
    public static String Capitalize(String word){
        String s1= word.substring(0,1);
        String s2 = word.substring(1);
        String res = toUpperCase(s1)+ toLowerCase(s2);
        return res;
    }
    
    public static void main(String[] args) {
        String s="SuJeEtYADAv";
        System.out.println(toLowerCase(s) + '\n' + toUpperCase(s) + '\n' + Capitalize(s));
        
    }
}

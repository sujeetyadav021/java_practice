package strings;


public class convert_first_ch_to_uppercase {

    public static String toUpper(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    } 

    public static void main(String[] args) {
        String str = "sujeet yadav";
        System.out.println(toUpper(str));
        
    }
}

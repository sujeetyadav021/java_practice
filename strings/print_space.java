package strings;

public class print_space {
    public static void main(String[] args) {
        //print yes if string contains blank space else print no
        String s = "SujeetYadav";
        boolean found = false;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)==' '){
                found=true;
            }
        }
        if(found== true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

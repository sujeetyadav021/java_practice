package strings;

public class shortest_path {

    public static float path(String str){
        int x=0 , y=0;
        for(int i=0;i<str.length();i++){
            int dir = str.charAt(i);
            if(dir=='W'){
                x--;
            }
            else if(dir=='E'){
                x++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
        }
        int xSquare=(x*x);
        int ySquare=(y*y);
        return (float) Math.sqrt(xSquare+ySquare);

    }
    public static void main(String[] args) {
        String str ="WNEENESENNNNNE";
        System.out.println(path(str));
    }
}

package oops;

class Filter{

    String  filter(String str, char ch){
        String res="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                res += str.charAt(i);
            }
        }
        return res;
    }

    int[] filter(int[] arr,int el){
        int n= arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el){
                count++;
            }
        }
        
        int res[]=new int[n-count];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=el){
                res[index] = arr[i]; 
                index++;

            }
        }
        return res;

    }

    char[] filter(char[] arr,int ch){
        int n= arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==ch){
                count++;
            }
        }
        
        char res[]=new char[n-count];
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=ch){
                res[index] = arr[i]; 
                index++;

            }
        }
        return res;

    }


}

public class Filter_proble_oops {
    
}

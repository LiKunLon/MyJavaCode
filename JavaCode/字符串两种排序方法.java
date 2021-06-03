import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=br.readLine();
        }
        if(isSortedZidian(str)&&isSortedLength(str)){
            System.out.println("both");
        }else if(isSortedZidian(str)){
            System.out.println("lexicographically");
        }else if(isSortedLength(str)){
            System.out.println("lengths");
        }else{
            System.out.println("none");
        }
    }
    
    public static boolean isSortedZidian(String[] str){
        for(int i=0;i<str.length-1;i++){
            if(str[i].compareTo(str[i+1])>0){
                return false;
            }
        }
        return true;
    }
    public static boolean isSortedLength(String[] str){
        for(int i=0;i<str.length-1;i++){
            if(str[i].length()>str[i+1].length()){
                return false;
            }
        }
        return true;
    }
}
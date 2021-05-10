import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        
        String longer="";
        String shorter="";
        if(str1.length()>str2.length()){
            longer=str1;
            shorter=str2;
        }else{
            longer=str2;
            shorter=str1;
        }
        int max=0;
        String cur="";
        for(int i=0;i<shorter.length();i++){
            for(int j=i;j<shorter.length();j++){
                cur=shorter.substring(i,j+1);
                if(longer.contains(cur)&& cur.length()>max){
                    max=cur.length();
                }
            }
        }
        System.out.println(max);
    }
}
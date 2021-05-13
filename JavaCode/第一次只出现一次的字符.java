第一种方法

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            boolean flg=true;
            String str=sc.nextLine();
            for(int i=0;i<str.length();i++){
                if(str.indexOf(str.charAt(i)+"")==str.lastIndexOf(str.charAt(i)+"")){
                    System.out.println(str.charAt(i));
                    flg=false;
                    break;
                }
            }
            if(flg){
                System.out.println(-1);
            }
            
        }
    }
}

第二种


String str=sc.nextLine();
            char[] ch=str.toCharArray();
            char[] count=new char[128];
            boolean flag=false;
            for(int i=0;i<str.length();i++){
                count[ch[i]]++;
            }
            for(int i=0;i<str.length();i++){
                if(count[ch[i]]==1){
                    flag=true;
                    System.out.println(ch[i]);
                    break;
                }
            }
            if(!flag){
                System.out.println(-1);
            }
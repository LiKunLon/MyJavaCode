import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            //数字范围太大，用字符串接收；
            String n=sc.nextLine();
            int sum=0;
            for(int i=0;i<n.length();i++){
                //把字符串中每一位转化成int加起来
                sum+=n.charAt(i)-'0';
            }
            int a;
            int b;
            //sum不是一位的情况，有可能是三位
            //对sum再进行求和
            while(sum>=10){
                a=sum;
                b=0;
                while(a!=0){
                    b+=a%10;
                    a/=10;
                }
                sum=b;
                
            }
            System.out.println(sum);
        }
    }
}
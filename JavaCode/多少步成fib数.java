import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int f1=0;
        int f2=1;
        int f3=0;
        //生成斐波那契数列
        while(n>f2){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        if(Math.abs(f1-n)<Math.abs(f2-n)){
            System.out.println(Math.abs(f1-n));
        }else{
            System.out.println(Math.abs(f2-n));
        }
    }
}
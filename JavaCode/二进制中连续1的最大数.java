import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int max=0;
            while(n>0){
                int count=0;
                while((n&1)==1){
                    count++;
                    n=n>>1;
                }
                //跳出循环，说明遇到0了
                //比较一下count和max大小
                //继续右移，直至n=0
                if(count>max){
                    max=count;
                }else{
                    count=max;
                }
                n=n>>1;
            }
            System.out.println(max);
        }
    }
}
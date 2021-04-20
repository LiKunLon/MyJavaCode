import java.util.*;
import java.lang.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int[] num=new int[n];
            for(int i=0;i<n;i++){
                num[i]=scanner.nextInt();
            }
            //创建个数组保存答案
            int[] res=new int[2];
            for(int i=0;i<n;i++){
                int j=i;
                //往左
                while(j>=0 && j<n){
                    j--;
                    if(j>=0){
                        if(num[j]<num[i]){
                            res[0]=j;
                            break;
                        }
                    }else{
                        res[0]=-1;
                    }
                }
                //经过一个循环，j的值已经变了
                //要记得重新赋值
                j=i;
                //往右
                while(j>=0 && j<n){
                    j++;
                    if(j<n){
                        if(num[j]<num[i]){
                            res[1]=j;
                            break;
                        }
                    }else{
                        res[1]=-1;
                    }
                }
                System.out.println(res[0]+" "+res[1]);
            }
        }
    }
}




import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            Set<Integer> list=new HashSet<>();
            for(int i=0;i<n;i++){
                if(!list.contains(arr[i])){
                    list.add(arr[i]);
                }else{
                    list.remove(arr[i]);
                }
            }
            int[] res=new int[2];
            int k=0;
            for(int i=0;i<n;i++){
                if(list.contains(arr[i])){
                    list.remove(arr[i]);
                    res[k++]=arr[i];
                    if(k==2)break;
                }
            }
            if(res[0]>res[1]){
                System.out.println(res[1]+" "+res[0]);
            }
            if(res[1]>res[0]){
                System.out.println(res[0]+" "+res[1]);
            }
        }
    }
}
// write your code here
import java.util.*;
import java.lang.*;
//逆波兰表达式求值
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            Stack<String> stack=new Stack();
            for(int i=0;i<n;i++){
                String s=sc.next();
                if(s.charAt(0)=='+'){
                    stack.push(String.valueOf(Integer.parseInt(stack.pop())+Integer.parseInt(stack.pop())));
                }else if(s.charAt(0)=='-'){
                    int a=Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(Integer.parseInt(stack.pop())-a));
                }else if(s.charAt(0)=='*'){
                    stack.push(String.valueOf(Integer.parseInt(stack.pop())*Integer.parseInt(stack.pop())));
                }else if(s.charAt(0)=='/'){
                    int b=Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(Integer.parseInt(stack.pop())/b));
                }else{
                    stack.push(s);
                }
            }
            System.out.println(stack.pop());
            
        }
    }
}
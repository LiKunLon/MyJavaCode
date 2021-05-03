import java.util.*;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if(n%2!=0)return false;
        Stack<Character> stack=new Stack<>();
        for(char c: A.toCharArray()){
            if(c=='('){
                stack.push(c);
            }else if(c==')'){
                //右括号先于左括号出现，不合法
                if(stack.isEmpty()){
                    return false;
                }else if(stack.peek()=='('){
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        //遍历完，栈为空
        return stack.isEmpty();
    }
}
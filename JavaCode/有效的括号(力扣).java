class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        //如果字符串长度为奇数
        //直接返回false
        if(s.length()%2!=0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            //将字符串中左括号压入栈
            if(ch=='('||ch=='['||ch=='{'){
                stack.push(ch);
            }else{
                if(stack.empty()){
                    //如果栈是空的,说明全是右括号
                    return false;
                }
                //拿到栈顶字符
                char newTop=stack.peek();
                if(newTop=='('&&ch==')'||newTop=='['&&ch==']'||newTop=='{'&&ch=='}'){
                    //如果匹配直接弹出
                    stack.pop();
                }else{
                    //括号不匹配,,返回false
                    return false;
                }
            }
        }
        //遍历完循环退出,,栈还不是空的,说明有多余
        //返回false;;
        if(!stack.empty()){
            return false;
        }
        return true;
    }
}
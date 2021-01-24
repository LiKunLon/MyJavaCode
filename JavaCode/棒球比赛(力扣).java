class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack();
        for(String str: ops){
            if(str.equals("+")){
                //先弹出栈顶元素,为了方便拿到第二个元素
                int top=stack.pop();
                int newTop=stack.peek();
                //再把之前弹出的元素放回来
                //先放之前弹出的,再放 和 ;
                stack.push(top);
                stack.push(top+newTop);
            }else if(str.equals("C")){
                stack.pop();
            }else if(str.equals("D")){
                stack.push(stack.peek()*2);
            }else{
                stack.push(Integer.valueOf(str));
            }
        }
        int sum=0;
        for(int i:stack){
            sum+=i;
        }
        return sum;
    }
}
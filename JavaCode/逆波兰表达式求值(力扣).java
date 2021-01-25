class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            switch(tokens[i]){
                //第一次出栈的作为右操作数
                //第二次出栈的作为左操作数
                case "+":
                stack.push(stack.pop()+stack.pop());
                break;
                case "-":
                //注意先后顺序
                int a=stack.pop();
                stack.push(stack.pop()-a);
                break;
                case "*":
                stack.push(stack.pop()*stack.pop());
                break;
                case "/":
                //注意先后顺序
                int b=stack.pop();
                stack.push(stack.pop()/b);
                break;
                default:
                //Integer.parseInt
                //是将整型数据Integer转换为基本数据类型int
                stack.push(Integer.parseInt(tokens[i]));
                break;
            }
        }
        return stack.pop();
    }
}
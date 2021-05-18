class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> stack=new Stack<>();
        //创建一个栈，把是字母的全添加进去
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                stack.push(c);
            }
        }
        StringBuffer sb=new StringBuffer();
        //再遍历栈，此时就逆序了
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                sb.append(stack.pop());
            }else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
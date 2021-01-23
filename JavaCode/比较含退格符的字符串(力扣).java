class Solution {
    public boolean backspaceCompare(String S, String T) {
        return func(S).equals(func(T));
    }
    public String func(String str){
        StringBuffer sb=new StringBuffer();
        int len=str.length();
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch!='#'){
                sb.append(ch);
            }else{
                //这个if是用来排除第一个字符就是#的情况
                if(sb.length()>0){
                    //如果拼接进来的字符下一个就是#
                    //那就删除最后拼进来的字符
                    //位置就是sb.length()-1
                    sb.deleteCharAt(sb.length()-1);
                }
            }
        }
        return sb.toString();
    }
}
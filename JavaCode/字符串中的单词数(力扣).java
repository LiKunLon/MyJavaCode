class Solution {
    public int countSegments(String s) {
        //判空
        if(s==null||s.equals("")){
            return 0;
        }
        //删除前后空格
        s=s.trim();
        int count=0;
        char last=' ';
        int n=s.length();
        //遍历数组
        for(int i=0;i<n;i++){
            //前一个字符是空格,,下一个不是空格
            //计数器加一
            if(last==' '&&s.charAt(i)!=' '){
                count++; 
            }
            //加完了走下一个字符
            last=s.charAt(i);  
        }
    return count;
    }
}
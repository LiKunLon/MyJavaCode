public class Solution {
    public int StrToInt(String str) {
        //转成数组
        char[] ch=str.toCharArray();
        if(ch==null||ch.length==0){
            return 0;
        }
        int flag=1;
        //处理正负号
        if(ch[0]=='-'){
            flag=-1;
            ch[0]='0';
        }else if(ch[0]=='+'){
            flag=1;
            ch[0]='0';
        }
        int sum=0;
        for(int i=0;i<ch.length;i++){
            //注意是 或
            if(ch[i]<'0'|| ch[i]>'9'){
                sum=0;
                break;
            }
            //两个字符相减结果是整形
            sum=sum*10+ch[i]-'0';
        }
        return flag*sum;
    }
}
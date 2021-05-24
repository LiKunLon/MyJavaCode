public class Solution {
    public String LeftRotateString(String str,int n) {
//         if(n>=str.length())return str;
//         int len=str.length();
//         String str1=str.substring(0,n);
//         String str2=str.substring(n,len);
//         return str2+str1;
        if(n>=str.length())return str;
        
        char[] chars=str.toCharArray();
        int len=chars.length;
        reverse(chars,0,n-1);
        reverse(chars,n,len-1);
        reverse(chars,0,len-1);
        return new String(chars);
    }
    public void reverse(char[] chars,int left,int right){
        
        while(left<right){
            char tmp=chars[left];
            chars[left]=chars[right];
            chars[right]=tmp;
            left++;
            right--;
        }
    }
}
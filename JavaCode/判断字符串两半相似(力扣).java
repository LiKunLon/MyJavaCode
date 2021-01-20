class Solution {
    public boolean halvesAreAlike(String s) {
       //定义了两个计数器
       int left=0;
       int right=0;
       int n=s.length();
       for(int i=0;i<n;i++){
           //用charAt(i)来访问字符串内每个字符
           char ch=s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
               if(i<(n/2)){
                   left++;
               }else{
                   right++;
               }
           }
       }
       return left==right;
    }
}
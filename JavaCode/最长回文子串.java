class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int start=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                //优化，要是比上一次的长度小，就不判断了，结束本次循环
                if(j-i<max){
                    continue;
                }
                //截取判断
                if(isPalin(s,i,j) ){
                    //更新max
                    if(max<j-i+1){
                        start=i;
                        max=j-i+1;
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }
    //判断回文
    public boolean isPalin(String s,int start,int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}
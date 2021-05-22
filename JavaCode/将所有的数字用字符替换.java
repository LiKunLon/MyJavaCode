class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
        char[] str=s.toCharArray();
        for(int i=1;i<n;i+=2){
            str[i]=(char)(str[i]-'0'+str[i-1]);
        }
        return String.valueOf(str);
    }
}
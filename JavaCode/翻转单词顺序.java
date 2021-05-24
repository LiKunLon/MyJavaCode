class Solution {
    public String reverseWords(String s) {
        String[] chars=s.trim().split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=chars.length-1;i>=0;i--){
            if(chars[i].equals(""))continue;
            sb.append(chars[i]+" ");
        }
        return sb.toString().trim();
    }
}
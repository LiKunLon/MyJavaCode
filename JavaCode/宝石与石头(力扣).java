class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        int jlen=jewels.length();
        int slen=stones.length();
        for(int i=0;i<jlen;i++){
            char a=jewels.charAt(i);
            for(int j=0;j<slen;j++){
                char b=stones.charAt(j);
                if(a==b){
                    count++;
                    //找到一个,计数器加一,开始下一个jewel
                }
            }
        }
        return count;
    }
}
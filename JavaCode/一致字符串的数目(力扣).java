class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        int n=words.length;
        //遍历字符串数组的每一个字符串
        for(int i=0;i<n;i++){
            //遍历每一个字符串的每一个字符
            for(int j=0;j<words[i].length();j++){
                //words[i].charAt(j)每个字符串里的每个字符
                //allowed.indexOf()返回指定字符第一次出现的字符串内的索引
                //找不到count++
                if(allowed.indexOf(words[i].charAt(j))==-1){
                    count++;
                    break;
                }
            }
        }
        //count表示的是不一致的
        //所以n-count
        return n-count;
    }
}
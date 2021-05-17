public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            count+=find(i);
        }
        return count;
        
    }
    public int find(int n){
        String str=n+"";
        char[] c=str.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='1'){
                count++;
            }
        }
        return count;
    }
}
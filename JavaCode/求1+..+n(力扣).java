class Solution {
    //不能用if判断,
    //就定义一个boolean来判断
    int res=0;
    public int sumNums(int n) {
        boolean x=(n>1)&&sumNums(n-1)>0;
        res+=n;
        return res;
    }
}
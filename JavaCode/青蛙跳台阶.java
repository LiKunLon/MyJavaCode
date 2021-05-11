class Solution {
    public int numWays(int n) {
        int f1=1;
        int f2=1;
        int f3=0;
        for(int i=0;i<n;i++){
            f3=(f1+f2)%1000000007;
            f1=f2;
            f2=f3;
        }
        return f1;
    }
}
求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。


利用求和公式（化简一下）
public class Solution {
    public int Sum_Solution(int n) {
        int sum=(int)Math.pow(n,2)+n;
        return sum>>1;
    }
}
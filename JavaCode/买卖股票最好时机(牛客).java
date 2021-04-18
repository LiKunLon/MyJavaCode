import java.util.*;


public class Solution {
    /**
     * 
     * @param prices int整型一维数组 
     * @return int整型
     */
    public int maxProfit (int[] prices) {
        // write code here
        int min = prices[0];
        int max = 0;
        for(int i = 0 ; i < prices.length ; i++)
        {
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
   
}
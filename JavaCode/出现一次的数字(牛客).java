import java.util.*;


public class Solution {
    /**
     * 
     * @param A int整型一维数组 
     * @return int整型
     */
    public int singleNumber (int[] A) {
        // write code here
        int sum=A[0];
        for(int i=1;i<A.length;++i){
            sum=sum^A[i];
        }
        return sum;
    }
}
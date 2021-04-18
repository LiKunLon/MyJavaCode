import java.util.*;


public class Solution {
    /**
     * 
     * @param m int整型 
     * @param n int整型 
     * @return int整型
     */
    public int uniquePaths (int m, int n) {
        // write code here
        int[][] data=new int[m][n];
        //如果只有一行一列，就只有一条路径
        for(int i=0;i<m;++i){
            data[i][0]=1;
        }
        for(int j=0;j<n;j++){
            data[0][j]=1;
        }
        //每个点的路径数等于左边的加上面的路径数
        //相当于是一个杨辉三角
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                data[i][j]=data[i-1][j]+data[i][j-1];
            }
        }
        //最后返回右下角的数字就是路径数
        return data[m-1][n-1];
    }
}
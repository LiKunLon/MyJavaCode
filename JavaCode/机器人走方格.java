import java.util.*;

public class Robot {
    public int countWays(int x, int y) {
        // write code here
        
        int[][] data=new int[x+1][y+1];
        for(int i=1;i<=x;i++)data[i][1]=1;
        for(int i=1;i<=y;i++)data[1][i]=1;
        for(int i=2;i<=x;i++){
            for(int j=2;j<=y;j++){
                data[i][j]=data[i-1][j]+data[i][j-1];
            }
        }
        return data[x][y];
    }
}
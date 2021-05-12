import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] arr) {
       ArrayList<Integer> list=new ArrayList<>();
        if(arr.length==0) return null;
        int top=0;
        int bottom=arr.length-1;
        int left=0;
        int right=arr[0].length-1;
        while(true){
            //往右
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;
            if(top>bottom) break;
            //往下
            for(int i=top;i<=bottom;i++){
                list.add(arr[i][right]);
            }
            right--;
            if(left>right)break;
            //往左
            for(int i=right;i>=left;i--){
                list.add(arr[bottom][i]);
            }
            bottom--;
            if(top>bottom)break;
            //往上
            for(int i=bottom;i>=top;i--){
                list.add(arr[i][left]);
            }
            left++;
            if(left>right)break;
        }
        return list;
    }
}
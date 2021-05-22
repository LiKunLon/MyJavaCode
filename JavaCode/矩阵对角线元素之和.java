class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                //奇数情况的中点
                if(i==j){
                    sum+=mat[i][j];
                }
                //对角线元素满足的特性
                if(i+j==mat.length-1){
                    sum+=mat[i][j];
                }
            }
        }
        if(mat.length%2==0){
            return sum;
        }
        //奇数情况下，中点被多算了一次
        return sum-mat[(mat.length-1)/2][(mat.length-1)/2];
    }
}
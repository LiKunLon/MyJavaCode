class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        while(k>0){
            //创建一个新的数组为移动后的数组
            int[][] newArr=new int[grid.length][grid[0].length];
            //同一行元素向后移动
            //第一个循环不用-1,不会越界
            //第二个循环-1,会有越界的情况
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length-1;j++){
                    newArr[i][j+1]=grid[i][j];
                }
            }
            //当前行最后一个元素移动到下一行第一个元素
            //遍历行数就行
            for(int i=0;i<grid.length-1;i++){
                newArr[i+1][0]=grid[i][grid[0].length-1];
            }
            //最后一个元素给第一个元素
            newArr[0][0]=grid[grid.length-1][grid[0].length-1];
            //移动好放入原数组
            grid=newArr;
            //每移动一次k减一
            k--;
        }

        //打印
        List<List<Integer>> list = new ArrayList<>();
        for (int[] row : grid) {
            List<Integer> listRow = new ArrayList<>();
            list.add(listRow);
            for (int x : row){
                listRow.add(x);
            }
        }
        return list;
    }
}
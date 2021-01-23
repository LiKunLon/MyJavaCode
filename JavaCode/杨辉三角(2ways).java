//杨辉三角
    //①泛型
    public List<List<Integer>> func(int numRows){
        List<List<Integer>> ret=new ArrayList<>();
        if(numRows<=0){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        list.add(1);
        ret.add(list);
        for(int i=1;i<numRows;i++){
            List<Integer> curRow=new ArrayList<>();
            curRow.add(1);
            for(int j=1;j<i;j++){
                List<Integer> prevRow=new ArrayList<>();
                int num=prevRow.get(j-1)+prevRow.get(j);
                curRow.add(num);
            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
    //数组
    public static int[][] Triangle(int num){
        int[][] arr=new int[num][num];
        for (int i = 0; i <num ; i++) {
            arr[i][0]=arr[i][i]=1;
            for (int j = 0; j <num ; j++) {
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
        return arr;
    }
    public static void print(int[][] arr){
        int len=arr.length;
        for (int i = 0; i <len ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
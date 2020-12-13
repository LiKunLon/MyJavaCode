//交换两个数组内容
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={6,5,4,3,2,1};
        for(int i=0;i<6;i++){
            int tmp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=tmp;
        }
        for (int x:arr1
             ) {
            System.out.print(x+" ");
        }
        System.out.println();
        for (int a:arr2
             ) {
            System.out.print(a+" ");
        }
public static void main(String[] args) {
        //初始化数组
        int[] arr =new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入十个数:");
        //循环输入十个数
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个数");
            arr[i]=sc.nextInt();
        }
        //冒泡排序(升序)
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        //for-each打印数组
        for (int x:arr) {
            System.out.println(x);
        }
    }
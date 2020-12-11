//求一个整数存储时二进制1的个数
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num&(num-1);
            count++;
        }
        System.out.println(count);
    }
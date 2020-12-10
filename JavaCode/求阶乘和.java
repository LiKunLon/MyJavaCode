//求阶乘和
    public static void main(String[] args) {
        System.out.println("请输入所求的阶乘:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int j=1;j<=n;j++){
           sum+= Fac(j);
        }
        System.out.println(sum);
    }
    public static int Fac(int n){
        int ret=1;
        for (int i=1;i<=n;i++){
            ret*=i;
        }
        return ret;
    }
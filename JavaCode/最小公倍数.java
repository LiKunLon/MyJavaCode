public static void main(String[] args) {
        System.out.println("输入两个数:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("这两数的最小公倍数为:"+beiShu(a,b));
    }
    public static int beiShu(int a,int b){
        int m=a;
        int n=b;
        while(b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        return m*n/a;
    }
}
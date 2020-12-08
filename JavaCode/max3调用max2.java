public static void main(String[] args) {
        System.out.println("输入三个数:");
        Scanner sc=new Scanner(System.in );
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("最大数为:");
        System.out.println(max3(a,b,c));
    }
    public static int max2(int a,int b){
        return a>b?a:b;
    }
    public static int max3(int a,int b,int c){
        return max2(max2(a,b),c);
    }

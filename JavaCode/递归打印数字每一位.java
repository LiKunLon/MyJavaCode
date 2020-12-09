public static void main(String[] args) {
        System.out.println("输入一个数:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pri(n);
    }
    public static void Pri(int n){
        if(n>9)
            Pri(n/10);
        System.out.println(n%10);
    }
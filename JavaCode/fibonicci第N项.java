//递归求斐波那契第N项
    public static void main(String[] args) {
        System.out.println("求到第几项:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
        System.out.println(fib2(n));
    }
    //递归
    public static int fib(int n){
        if(n<3){
            return 1;
        }
        else
            return fib(n-1)+fib(n-2);
    }
    //非递归
    public static int fib2(int n){
        if(n<=2){
            return 1;
        }
        else{
            int first=1;
            int second=1;
            int total=0;
            while(n>2){
                total=first+second;
                first=second;
                second=total;
                n--;
            }
            return total;
        }
    }
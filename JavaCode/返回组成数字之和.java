public static void main(String[] args) {
        System.out.println("请输入一个数字:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("和为:"+add(num));
    }
    public static int add(int n){
        if(n<9){
            return n;
        }
        else{
            return n%10+add(n/10);
        }
    }
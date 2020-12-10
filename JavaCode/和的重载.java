public static void main(String[] args) {
        System.out.println("输入的数字个数:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2){
            System.out.println("输入数字:");
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("这两个数和为:"+addInt(a,b));
        }
        else if(n==3){
            System.out.println("输入数字:");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            System.out.println("这三个小数的和为:"+addDouble(a,b,c));
        }
    }
    public static int addInt(int a,int b){
        return a+b;
    }
    public static double addDouble(double a,double b,double c){
        return a+b+c;
    }
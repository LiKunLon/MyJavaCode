public static void main(String[] args) {
        System.out.println("输入数字的个数为：");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println("输入数字：");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int num1 = max( a , b );
            System.out.println("最大值为："+num1);//输出两个整数比较大小的值
            double c = sc.nextDouble();
            double d = sc.nextDouble();
            double num2 = max( c , d );
            System.out.println("最大值为："+num2);//输出两个小数比较大小的值
        }else if (n==3){
            System.out.println("输入数字：");
            double e = sc.nextDouble();
            double f = sc.nextDouble();
            int g = sc.nextInt();
            double num3 = max( e , f , g );
            System.out.println("最大值为："+num3);//输出两个小数和一个整数比较大小的值
        }
    }
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public static double max(double a,double b){
        return a>b?a:b;
    }
    public static double max(double a,double b,int c){
        return max(a,b)>c?max(a,b):c;
    }
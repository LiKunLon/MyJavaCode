//用户输入三个数字,从小到大输出
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        System.out.println("输入的三个数字为:");
        System.out.println("a="+a+",b="+b+",c="+c);
        input.close();
        if(a>b){
            int t=a;
            a=b;
            b=t;
        }
        if(b>c){
            int t=b;
            b=c;
            c=t;
        }
        if(a>c){
            int t=a;
            a=c;
            c=t;
        }
        System.out.println("这三个数从小到大的顺序为:");
        System.out.println("a="+a+",b="+b+",c="+c);
    }
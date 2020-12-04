//用户输入三个数字,输出最大最小值
    public static void main(String[] args) {
        System.out.println("请输入三个待比较数:");
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
        System.out.println("最大值为:"+c);
        System.out.println("最小值为:"+a);
    }
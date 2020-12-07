/求两个正整数最大公约数(辗转相除法)
    public static void main(String[] args) {
        System.out.println("请输入两个整数:");
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        int b=num.nextInt();
        while(b!=0){
            int c=a%b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
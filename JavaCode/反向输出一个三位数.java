//反向输出一个三位数
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a=num%10;//个位数;
        int b=num/10%10;//十位数;
        int c=num/100;//百位数;
        String str="反向输出结果为:";
        System.out.println(str+a+b+c);
    }
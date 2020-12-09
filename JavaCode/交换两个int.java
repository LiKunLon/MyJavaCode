 public static void main(String[] args) {
      //  System.out.println("hello,world!");
        //交换两个int
        int a=10;
        int b=20;
        //①创建第三个变量
       /* int c=a;
        a=b;
        b=c;*/
        //②加减法交换
        /*a=a+b;
        b=a-b;
        a=a-b;*/
        //③运算符
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a+",b="+b);
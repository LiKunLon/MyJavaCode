//字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。
    //请定义一个函数实现字符串左旋转操作的功能。
    //比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。

    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(Turn(str, 4));

    }
    public static String Turn(String str,int n){
        String a=str.substring(n);
        String b=str.substring(0,n);
        return a+b;
    }
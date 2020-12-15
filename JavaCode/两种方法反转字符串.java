public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=func1(str1);
        String str3=func2(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
    //字符串转字符数组
    public static String func2(String str){
        char[] arr=str.toCharArray();
        int len=arr.length;
        for (int i = 0; i <(len/2) ; i++) {
            char tmp=arr[i];//从前往后走
            arr[i]=arr[len-1-i];//从后往前走
            arr[len-1-i]=tmp;
            //循环完成交换
        }
        return new String(arr);
    }
    //字符串反转方法
    public static String func1(String str){
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
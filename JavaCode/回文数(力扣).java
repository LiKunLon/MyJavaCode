//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        public static boolean isPalindrome(int x) {
            if(x<0){//负数不是回文数
                return false;
            }
            int cur=0;
            int num=x;
            while(num!=0){
                cur=cur*10+num%10;//计算倒序数值
                num/=10;
            }
            return cur==x;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int a=sc.nextInt();
        System.out.println(isPalindrome(a));;
    }
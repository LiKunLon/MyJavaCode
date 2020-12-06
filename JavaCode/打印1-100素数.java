//打印1-100的素数
    public static void main(String[] args) {
        int i=0;
        int j=0;
        for(i=1;i<=100;i++) {//循环1-100
            for (j = 2; j < i; j++) {//在[2,i-1]区间循环
                if (i % j == 0) {//不是素数,循环结束
                    break;
                }
            }
            if(j>=i) {//没有满足循环条件的数就是素数
                System.out.println(i);
            }
        }
    }
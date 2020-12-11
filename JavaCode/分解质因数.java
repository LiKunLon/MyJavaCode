public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int m=sc.nextInt();
        int n=2;
        System.out.print(m+"=");//打印不用换行
        while(n<=m){
            if(m==n){
                System.out.print(m);
                break;//找到最后一个质因数后break
            }
            else if(m%n==0){//找到一个质因数
                System.out.print(n+"*");
                m=m/n;//新的m
            }
            else{//寻找下一个质因数
                n++;
            }
        }
    }
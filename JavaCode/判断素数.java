 public static void main(String[] args) {
        System.out.println("请输入要判断的素数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        for (i=2; i < num; i++){
            if(num%i==0){
                break;
            }
        }
        if(num>i){
            System.out.println("不是素数");
        }else{
            System.out.println("是素数");
        }
}
    //根据年龄打印年龄段
    public static void main(String[] args) {
        System.out.println("请输入所要判断的年龄:");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("这是个少年!");
        }
        else if(age>=19&&age<=28){
            System.out.println("这是个青年!");
        }else{
            System.out.println("这是个老年!");
        }
    }

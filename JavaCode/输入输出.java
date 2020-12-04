 public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入你的名字:");
        String name=input.nextLine();
        System.out.println(name);
        System.out.println("请输入你的年龄：");
        int age=input.nextInt();
        System.out.println(age);
        System.out.println("请输入你的工资：");
        float salary=input.nextFloat();
        System.out.println(salary);
        System.out.println("你的信息如下:");
        System.out.println("姓名:"+name+",年龄:"+age+",工资:"+salary);
        input.close();
    }
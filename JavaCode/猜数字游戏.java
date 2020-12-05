//猜数字游戏
    public static void menu() {
        System.out.println("***********************");
        System.out.println("***欢迎来到猜数字游戏******");
        System.out.println("********1.play*********");
        System.out.println("********2.quit*********");
        System.out.println("***********************");

    }

    public static void game() {
        System.out.println("开始游戏!");
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int toGuess=random.nextInt(100)+1;
        while(true){
            System.out.println("请输入你猜的数字:(1-100)");
            int num=sc.nextInt();
            if(num<toGuess){
                System.out.println("小了");
            }else if(num>toGuess){
                System.out.println("大了");
            }else{
                System.out.println("bingo!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        boolean flag=true;
        while(flag){
            menu();
            System.out.println("请输入指令是否开始游戏:");
            Scanner sc=new Scanner(System.in);
            int input=sc.nextInt();
            switch(input){
                case 1:
                    game();
                    System.out.println("就这?再来一把?");
                    break;
                case 2:
                    flag=false;
                    System.out.println("退出游戏!");
                    break;
                default:
                    System.out.println("你的输入有误!");
                    break;
            }
        }
    }
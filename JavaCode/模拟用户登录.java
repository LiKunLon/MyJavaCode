//模拟登陆
        public static void main(String[] args) {
            //登陆次数
            for (int i = 0; i < 3; i++) {
                //定义用户名与密码
                String username = "Lkl";
                String password = "123456";
                //键盘录入登录的用户名和密码，用scanner实现
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入用户名:");
                String name = scanner.nextLine();
                System.out.println("请输入密码：");
                String pwd = scanner.nextLine();
                //登录判断(用到了equals方法)
                if (name.equals(username) && pwd.equals(password)) {
                    System.out.println("登录成功，欢迎您:" + username);
                    break;
                } else {
                    if (2-i== 0){
                        System.out.println("你的登录次数已经用完，如有问题请与管理员联系！");
                    }else {
                        System.out.println("登录失败，你今天还有" + (2 - i) + "次登录的机会！");
                    }
                }
            }
        }
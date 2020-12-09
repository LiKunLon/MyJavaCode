//输出乘法口诀表(n由用户输入)
    public static void main(String[] args) {
        System.out.println("输入n决定几行几列:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(i+"*"+j + "=" + i*j+" ");
            }
            System.out.println();
        }
    }

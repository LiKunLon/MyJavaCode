public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        tower(n,'a','b','c');
        sc.close();
    }
    public static void tower(int n,char a,char b,char c){
        if(n==1){
            System.out.println(a+"->"+c);
        }else{
            tower(n-1,a,c,b);
            System.out.println(a+"->"+c);
            tower(n-1,b,a,c);
        }
    }
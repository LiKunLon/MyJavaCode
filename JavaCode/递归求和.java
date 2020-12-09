public static void main(String[] args) {
        System.out.println(add(10));
    }
    public static int add(int n){
        if(n==1){
            return n;
        }
        else{
            return n+add(n-1);
        }
    }
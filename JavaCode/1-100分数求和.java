 //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 
    public static void main(String[] args) {
        double i=0;//注意这里是double
        int j=1;
        double sum=0;
        for(i=1;i<=100;i++){
            sum=sum+(1/i)*j;
            j=-j;
        }
        System.out.println(sum);
    }
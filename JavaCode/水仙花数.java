//0-999间水仙花数
    public static void main(String[] args) {
        int num,sum;
        int i,j,k;
        for(num=100;num<=999;num++){
            i=num%10;//个位数
            j=(num/10)%10;//十位数
            k=(num/100)%10;//百位数
            sum=i*i*i+j*j*j+k*k*k;
            if(sum==num){
                System.out.println(num);
            }
        }
    }
  //1-100数字9出现的次数
    public static void main(String[] args) {
        int i=0;
        int count=0;
        for(i=1;i<=100;i++){
            if(i/10==9){//十位上是9的
                count++;
            }
            else if(i%10==9){//个位上是9的
                count++;
            }
        }
        System.out.println(count);
    }
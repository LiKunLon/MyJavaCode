//变种水仙花数 - Lily Number：把任意的数字，
    //从中间拆分成两个数字，比如1461 可以拆分成（1和461）,（14和61）,（146和1),所有拆分后的乘积之和等于自身，是一个Lily Number。
    //例如：655 = 6 * 55 + 65 * 5
    //1461 = 1*461 + 14*61 + 146*1
    //求出 5位数中的所有 Lily Number。
    public static void main(String[] args) {

        //1*4

        for(int num=9999;num<=99999;num++){
            int a=num/10000;
            int b=num%10000;
            //2*3  12345
            int c=num/1000;
            int d=num%1000;
            //3*2 12345
            int e=num/100;
            int f=num%100;
            //4*1
            int g=num/10;
            int h=num%10;
            if(num==a*b+c*d+e*f+g*h){
                System.out.print(num+" ");
            }
        }

    }
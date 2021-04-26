import java.util.*;
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        int month=sc.nextInt();
        int date=sc.nextInt();
        int days=0;
        for(int i=1;i<month;i++){
        //switch选择语句，注意break的位置
            switch(i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days+=31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days+=30;
                    break;
                case 2:
               		//判断闰年
                    if(year%4==0&&year%100!=0||year%400==0){
                        days+=29;
                         break;
                    }else{
                        days+=28;
                         break;
                    }
            }
        }
        //加上当前月份已经过去的天数
        days+=date;
        System.out.println(days);
    }
}

import java.lang.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float num1=sc.nextFloat();
        float num2=num1-(int)num1;
        if(num2*10>=5){
            System.out.println((int)num1+1);
        }else{
            System.out.println((int)num1);
        }
    
    }
}
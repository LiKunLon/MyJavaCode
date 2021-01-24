import java.util.*;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<ope.length;i++){
            if(ope[i][0]==1){
                //第一列数字为1,则把第二列加到list里
                list.add(ope[i][1]);
                //第一列数字为2的时候
            }else if(ope[i][0]==2){
                //分三种情况
                //第二列数字为0,出最先入栈的数
                if(ope[i][1]==0){
                    //用list访问到第一个数,加到res里面
                    res.add(list.get(0));
                    //然后把list第一个数字删除
                    list.remove(0);
                    //第二列数字为1,出最先入栈的正数
                }else if(ope[i][1]==1){
                    //在list里循环找第一个正数
                    for(int j=0;j<list.size();j++){
                        if(list.get(j)>0){
                            res.add(list.get(j));
                            list.remove(j);
                            break;
                        }
                    }
                }
                //注意这里是并列的else if 看清括号
                //第二列数字为-1,出最先入栈的负数
                else if(ope[i][1]==-1){
                    //在list里循环找负数,找到就退出循环
                     for(int j=0;j<list.size();j++){
                        if(list.get(j)<0){
                            res.add(list.get(j));
                            list.remove(j);
                            break;
                        }
                    }
                }
            }
        }
        return res;
    }
}
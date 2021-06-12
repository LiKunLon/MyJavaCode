import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        //滑动窗口思想
        int begin=1;
        int end=2;
        while(end>begin){
            //差为1的等差数列   区间内求和
            int cur=((begin+end)*(end-begin+1))/2;
            if(cur==sum){
                ArrayList<Integer> list=new ArrayList<>();
                for(int i=begin;i<=end;i++){
                    list.add(i);
                }
                res.add(list);
                begin++;//别忘了更新左边界
                //区间内的和大于sum，左边界向右移一个，就是区间内少了一个左边的值，区间和减小
            }else if(cur>sum){
                begin++;
            }else{
                //区间内的和小于sum，右边界向右移一个，就是区间内多了一个右边的值，区间和增大
                end++;
            }
        }
        return res;
    }
}
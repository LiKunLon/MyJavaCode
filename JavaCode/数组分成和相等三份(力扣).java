class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        //求出整个数组的和
        for(int num:arr){
            sum+=num;
        }
        //如果除三不等于零,说明不可能分成三份
        if(sum%3!=0){
            return false;
        }
        int target=sum/3;
        int len=arr.length;
        int cur=0;
        int i=0;
        //第一部分
        while(i<len){
            cur+=arr[i];
            if(cur==target){
                break;
            }
            i++;
        }
        //if(cur!=target){
        //    return false;
        //}
        int j=i+1;
        while(j+1<len){//满足最后一个数组非空
            cur+=arr[j];
            if(cur==target*2){
                return true;
            }
            j++;
        }
        return false;
    }
}

//第二种方法
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        //先把总和算出来
        for(int x:arr){
            sum+=x;
        }
        //除不尽说明不能分成三份
        if(sum%3!=0){
            return false;
        }
        int s=0;
        int num=0;
        for(int i:arr){
            s+=i;
            //满足一个sum/3,计数器加一下,把s重新赋值为0;直到遍历完数组
            if(s==sum/3){
                num++;
                s=0;
            }
        }
        //num不一定就是3
        //[10,-10,10,-10,10,-10,10,-10]
        return num>=3;
    }
}
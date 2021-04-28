class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len=0;
        //先求出新数组的长度
        for(int i=0;i<nums.length;i+=2){
            len+=nums[i];
        }
        int[] res=new int[len];

        int index=0;
        //遍历次数添加到新数组
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                res[index]=nums[i+1];
                index++;
            }
        }

        return res;
    }
class Solution {
    public int[] runningSum(int[] nums) {
        //直接在原数组上操作,,一次遍历即可
        //第一个数字就是本身,,直接从第二个数字开始
        //新的数组里面
        //比如示例1:
        //nums[3]=nums[3]+nums[2];
        //num[2]已经是前两个数字之和了
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
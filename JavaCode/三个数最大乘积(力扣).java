class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        //正负数都有,两个负数和最大整数乘积最大
        int left=nums[0]*nums[1]*nums[n-1];
        //全是正数,最大三个正数乘积
        int right=nums[n-1]*nums[n-2]*nums[n-3];
        return Math.max(left,right);
    }
}
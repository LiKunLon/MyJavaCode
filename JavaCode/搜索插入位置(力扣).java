class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]){
            return 0;
        }
        if(target>nums[nums.length-1]){
            return nums.length;
        }
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target && nums[i+1]>target){
                return i+1;
            }
        }
        return 0;
    }
}


二分查找


  int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)>>1;
            if(target==nums[mid]){
                return mid;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
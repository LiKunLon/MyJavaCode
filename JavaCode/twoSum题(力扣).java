//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

public int[] twoSum(int[] nums, int target) {
        int[] answer=new int[2];
        int len=nums.length;
        for (int i = 0; i <len-1 ; i++) {
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    answer[0]=i;
                    answer[1]=j;
                    return answer;
                }
            }
        }
        answer= new int[]{'没', '有'};
        return answer;
    }
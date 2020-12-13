数组中占比超过一半的元素称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。   

public int majorityElement(int[] nums) {
       Arrays.sort(nums);
        int len=nums.length;
        for (int i = 0; i <=(len/2) ; i++) {
            for(int j=i+(len/2);j<len;j++){
                if(nums[i]==nums[j]){
                    return  nums[i];
                }
            }
        }
        return -1;
    }
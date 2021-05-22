class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(find(nums[i])%2==0){
                count++;
            }
        }
        return count;
    }
    public static int find(int num){
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }
        return count;
    }
}
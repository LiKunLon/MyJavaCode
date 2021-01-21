class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] left=new int[n];
        int[] right=new int[n];
        int[] arr=new int[nums.length];
        int a=0;
        //数组左半部分
        for(int i=0;i<n;i++){
            left[i]=nums[i];
        }
        //数组右半部分
        for(int j=n;j<nums.length;j++){
            right[j-n]=nums[j];
        }
        //再传给新数组
        for(int k=0;k<n;k++){
            arr[a++]=left[k];
            arr[a++]=right[k];
        }
        return arr;
    }
}
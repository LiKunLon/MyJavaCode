class Solution {
    public int minArray(int[] arr) {
        int i=0;
        int j=arr.length-1;
        while(i<j){
            //没旋转的情况
            if(arr[i]<arr[j]){
                return arr[i];
            }
            int mid=(i+j)>>1;
            //如果中间比右边界的大
            //说明中间点在最小值的左边
            //把左边界拉过来
            if(arr[mid]>arr[j]){
                i=mid+1;
                //中间比右边小
                //说明中间点在最小值右边
                //把右边界拉过来
            }else if(arr[mid]<arr[j]){
                j=mid;
            }else{
                i++;
            }
        }
        return arr[i];
    }
}
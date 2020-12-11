//调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int len=arr.length;
        swap(arr,len);
        for(int i=0;i<len-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void swap(int[] arr,int len){
        int left=0;
        int right=len-1;
        for(int i=0;i<len;i++){
            while((left<right)&&(arr[left]%2==1)){
                left++;
            }
            while((left<right)&&(arr[right]%2==0)){
                right--;
            }
            if(left<right){
                int tmp=arr[left];
                arr[left]=arr[right];
                arr[right]=tmp;
            }
        }
    }
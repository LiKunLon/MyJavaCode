public int[] reOrderArray (int[] arr) {
        // write code here
        int k=0;
        int len=arr.length;
        int[] ans=new int[arr.length];
        for(int i=0;i<len;i++){
            if(arr[i]%2!=0){
                ans[k++]=arr[i];
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]%2==0){
                ans[k++]=arr[i];
            }
        }
        return ans;
    }
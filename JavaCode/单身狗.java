 public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,1};
        Single(arr);
    }
    public static void Single(int arr[]) {
        int a=0;
        for(int i=0;i<arr.length;i++){
            a=a^arr[i];
        }
        System.out.println(a);
    }
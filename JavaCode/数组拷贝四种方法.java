//数组拷贝
    //①arrays.copyof
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        for (int x:Arrays.copyOf(arr1, 6)
             ) {
            System.out.print(x+" ");
        }
    }
    //②system.arrcopy
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7};
        int[] arr2=new int[arr1.length];
        System.arraycopy(arr1,0,arr2,0,arr1.length);
        System.out.println(Arrays.toString(arr2));
    }
    //③引用.clone()
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=arr1.clone();
        for (int x:arr2
             ) {
            System.out.print(x+" ");
        }
    }
    //④循环
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2=new int[arr1.length];
        for (int i = 0; i <arr1.length ; i++) {
            arr2[i]=arr1[i];
        }
        for (int x:arr2
             ) {
            System.out.print(x+" ");
        }
    }
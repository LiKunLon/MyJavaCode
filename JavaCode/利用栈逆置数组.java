//栈 倒置数组
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        int[] arr1={1,2,3,4,5};
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            int num=arr1[i];
            stack.push(num);
        }
        for (int x:arr2) {
            x=stack.pop();
            System.out.print(x+" ");
        }
    }
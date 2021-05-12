class CQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    public CQueue() {
        stack1=new LinkedList<Integer>();//用来插入元素
        stack2=new LinkedList<Integer>();//辅助栈，删除元素
    }
    
    public void appendTail(int value) {
        //插入元素
        stack1.push(value);
    }
    
    public int deleteHead() {
        //如果第二个栈为空
        //就把第一个栈里的元素倒进第二个栈里面
        //因为要删除的是第一个插入的元素
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        //还要再判空
        if(stack2.isEmpty()){
            return -1;
        }else{
            int delete=stack2.pop();
            return delete;
        }
    }
}
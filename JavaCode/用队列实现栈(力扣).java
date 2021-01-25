class MyStack {
    private Queue<Integer> qu1=new LinkedList<>();
    private Queue<Integer> qu2=new LinkedList<>();

    /** Initialize your data structure here. */
    public MyStack() {

    }

    /** Push element x onto stack. */
    public void push(int x) {
        //哪个队列不为空,
        //放进哪个队列
        if(!qu1.isEmpty()){
            qu1.offer(x);
        }else if(!qu2.isEmpty()){
            qu2.offer(x);
        }else{
            qu1.offer(x);
        }

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(empty()){
            return -1;
        }
        //每次出不为空的队列,出size-1个到另一个空队列,弹出最后剩下的元素就是要出栈的
        if(!qu1.isEmpty()){
            int size=qu1.size();
            for(int i=0;i<size-1;i++){
                qu2.offer(qu1.poll());
            }
            return qu1.poll();
        }else{
            int size=qu2.size();
            for(int i=0;i<size-1;i++){
                qu1.offer(qu2.poll());
            }
            return qu2.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        if(empty()){
            return -1;
        }
        //每次出不为空的队列,出size-1个到另一个空队列,弹出最后剩下的元素就是要出栈的
        if(!qu1.isEmpty()){
            int size=qu1.size();
            int cur=-1;
            for(int i=0;i<size;i++){
                cur=qu1.poll();
                qu2.offer(cur);
            }
            return cur;
        }else{
            int size=qu2.size();
            int cur=-1;
            for(int i=0;i<size;i++){
                cur=qu2.poll();
                qu1.offer(cur);
            }
            return cur;
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return qu1.isEmpty()&&qu2.isEmpty();
    }
}
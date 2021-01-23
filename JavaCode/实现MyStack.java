class MyStack{
    public int[] elem;
    public int top;//可以代表下标:当前可以存放元素的下标.
                   //也可以代表当前存放了多少元素
    public MyStack(){
        this.elem=new int[10];
    }
    public boolean  isFull(){
        return this.top==this.elem.length;
    }
    public int push(int data){
        if(isFull()){
            throw new RuntimeException("栈满了!");
        }
        this.elem[top]=data;
        this.top++;
        return this.elem[top-1];//减一是因为上面有个++;但本身投票还是在上面,只是访问了下面的元素
    }
    public int pop(){
        if(empty()){
            throw new RuntimeException("栈为空!");
        }
        //让top的位置向下移动一个;
        //下次插入元素直接覆盖掉
        //就相当于是pop了
        this.top--;
        return this.elem[this.top];
    }
    public int peek(){
        if(empty()){
            throw new RuntimeException("栈为空!");
        }
        return this.elem[this.top-1];
    }
    public  boolean empty(){
        return this.top==0;
    }
    public int size(){
        return this.top;
    }
}
public class Test {
    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());//5
        System.out.println(stack.pop());//5
        System.out.println(stack.pop());//4
        System.out.println(stack.pop());//3
        System.out.println(stack.pop());//2
        System.out.println(stack.pop());//1
        System.out.println(stack.empty());
        System.out.println(stack.peek());
    }
class Node{
    public int val;
    public Node next;
    public Node(int val){
        this.val=val;
    }
}

class MyQueue{
    public Node first;
    public Node last;
    int size=0;
    public boolean offer(int val){
        Node node=new Node(val);
        if(this.first==null){
            this.first=node;
            this.last=node;
        }else{
            //实现的是队列;进行尾插
            this.last.next=node;
            node.next=null;
        }
        size++;
        return true;
    }
    public int poll() throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("队列是空的!");
        }
        int num=this.first.val;
        this.first=this.first.next;
        return num;
    }
    public int peek() throws RuntimeException{
        if(isEmpty()){
            throw new RuntimeException("队列是空的!");
        }
        int num=this.first.val;
        return num;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }

}
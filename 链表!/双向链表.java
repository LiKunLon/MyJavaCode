class ListNode{
    public int val;
    public ListNode prev;
    public ListNode next;
    public ListNode(int val){
        this.val=val;
    }

    public ListNode(int val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}
public class DoubleLinkedList {
    public ListNode head;
    public ListNode last;
    //头插法
    public void addFirst(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }else{
            node.next=this.head;
            this.head.prev=node;
            this.head=node;
        }
    }
    //尾插法
    public void addLast(int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            //一定要写last,不然链表不知道在哪
            this.last=node;
        }else{
            this.last.next=node;
            node.prev=this.last;
            this.last=node;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        ListNode node=new ListNode(data);
        if(this.head==null){
            this.head=node;
            this.last=node;
        }
        if(index==1){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        if(index<0||index>size()){
            System.out.println("index位置不合法!");
        }
        ListNode cur=this.head;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                return true;
            }
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head==null){
            return;
        }
        //删除节点在头
        if(this.head.val==key){
            this.head=this.head.next;
            this.head.next.prev=null;
        }
        if(this.last.val==key){
            this.last=this.last.prev;
            this.last.prev.next=null;
        }
        ListNode cur=this.head;
        while(cur!=null){
            if(cur.val==key){
                cur.prev.next=cur.next;
                cur.next.prev=cur.prev;
            }
            cur=cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){

    }
    //得到单链表的长度
    public int size(){
        if(this.head==null){
            return -1;
        }
        ListNode cur=this.head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    public void display(){
        ListNode cur=this.head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    public void clear1(){
        this.head=null;
        this.last=null;
    }
    //更彻底
    public void clear2(){
        ListNode cur=this.head;
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.prev=null;
            cur.next=null;
            cur=curNext;
        }
        this.head=null;
        this.last=null;
    }
}
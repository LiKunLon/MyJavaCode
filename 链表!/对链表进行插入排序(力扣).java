//力扣链接
https://leetcode-cn.com/problems/insertion-sort-list/



//对链表进行插入排序
    public Node insertionSortList(Node head){
        //判空
        if(this.head==null){
            return null;
        }
        Node node=new Node(-1);//创建傀儡节点,目的:方便插入
        node.next=head;//与头结点连接起来
        Node lastSorted=head;//
        Node cur=head.next;
        while(cur!=null){
            if(lastSorted.val<=cur.val){//排好序
                lastSorted=lastSorted.next;
            }else{
                Node prev=node;//要插入节点的前驱
                while(prev.next.val<=cur.val){
                    /**
                     * prev是要插入节点的前一个
                     * 如果prev下一个节点的val值大于cur的val值
                     * 就要把cur插入prev后面
                     * 这也是循环的退出条件
                     */
                    prev=prev.next;
                }
                //完成对cur的插入
                lastSorted.next=cur.next;//相当于是把要插入的节点在原位置删除,前后再连接起来
                cur.next=prev.next;
                prev.next=cur;
            }
            cur=lastSorted.next;//新的cur一直在lastSorted的后面
        }
        return node.next;
    }
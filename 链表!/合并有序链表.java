public Node heBing1(Node headA,Node headB){
        //创建一个傀儡节点(随意取值)
        Node newHead=new Node(-1);
        Node cur=newHead;
        //这两个链表不为空
        while(headA!=null&&headB!=null){
            //两个头结点先比较,小的先放进来,保证升序
            if(headA.val<headB.val){
                cur.next=headA;
                //放进来一个,就让新的头指向下一个
                headA=headA.next;
                cur=cur.next;
            }else{
                cur.next=headB;
                headB=headB.next;
                cur=cur.next;
            }
            //走到这,说明已经有一个链表放完了,一个为空,一个不为空
            if(headA==null){
                cur.next=headB;
            }
            if(headB==null){
                cur.next=headA;
            }
        }
        return newHead.next;
    }
public Node removeAllKey1(int key){
        if(this.head==null) return null;
        Node prev=this.head;
        Node cur=prev.next;
        //如果判断cur.next不为空,尾结点数据访问不到
        while(cur!=null){
            if(cur.val==key){
                //if满足,则cur就是所删节点
                prev.next=cur.next;
            }else{
                prev=cur;
            }
            cur=cur.next;
        }
        if(this.head.val==key){
            this.head=this.head.next;
        }
        return this.head;
    }

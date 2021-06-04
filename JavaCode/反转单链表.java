public Node FanZhuan(){
        Node newHead=null;
        Node cur=this.head;
        Node prev=null;
        while(cur!=null){
            //定义个引用保存cur.next
            Node curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }
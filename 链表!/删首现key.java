//删除第一次出现的key
    //先找要删除节点的前驱
    public Node QianQu(int key){
        Node cur=this.head;
        while(cur.next!=null){
            if(cur.next.val==key){
                return cur;
            }
            cur=cur.next;
        }
        return null;
    }
    public Node RemoveK(int key){
        if(this.head==null){
            return null;
        }
        //如果头结点就是目标
        if(this.head.val==key){
            this.head=this.head.next;
        }
        //正常删
        Node cur=this.head;
        Node prev=QianQu(key);
        if(QianQu(key)==null){
            System.out.println("没有前驱");
        }else{
            //把要删除的节点定义出来
            Node del=prev.next;
            prev.next=del.next;
        }
        return this.head;
    }
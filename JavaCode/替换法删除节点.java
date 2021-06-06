//替换法删除节点
    //实现一种算法，删除单向链表中间的某个节点（即不是第一个或最后一个节点），假定你只能访问该节点。
    public void delete1(Node node){
        if(node==null) return;
        node.val=node.next.val;//换值
        node.next=node.next.next;//换址
    }
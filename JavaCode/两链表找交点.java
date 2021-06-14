//输入两个链表,找出第一个公共节点
    public Node Point(Node headA,Node headB){
        //判空
        if(headA==null||headB==null){
            return  null;
        }
        int lenA=0;
        int lenB =0;
        Node l1=headA;
        Node l2=headB;
        //求两个链表长度
        while(l1!=null){
            l1=l1.next;
            lenA++;
        }
        while(l2!=null){
            l2=l2.next;
            lenB++;
        }
        //一定要指回来,不然下面会出现空指针异常
        l1=headA;
        l2=headB;
        int len =lenA-lenB;
        if(len<0){
            //l1永远放最长的链表
            len=lenB-lenA;
            l1=headB;
            l2=headA;
        }
        //让长链表先走len步
        while(len!=0){
            l1=l1.next;
            len--;
        }
        //往后遍历(一样了就停止)
        while(l1!=l2){
            l1=l1.next;
            l2=l2.next;
        }
        return l1;
    }
//输出该链表中倒数第k个结点

    /**
     * 快慢指针法
     * 1.先让fast走k-1步
     * 2.然后两个引用一人一步走
     * 直到fast.next为null
     * slow就是结果
     * @param k
     * @return
     */
    public Node FindK(int k){
        Node fast=this.head;
        Node slow=this.head;
        if(this.head==null){
            return null;
        }
        while(k-1!=0){
            if(fast.next!=null){
                fast=fast.next;
                k--;
            }else{
                return null;//代表k值过大
            }
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
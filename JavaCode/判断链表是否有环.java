public boolean Circle(){
        if(this.head==null){
            return false;
        }
        Node fast=this.head;
        Node slow=this.head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            //fast和slow相遇,说明有环
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
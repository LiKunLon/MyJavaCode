/**
     * 链表的回文结构
     * 1.先找中间结点(快慢指针)
     * 2.中点到结尾部分进行反转
     * 3.从前往后走,从后往前走
     */
    public boolean HuiWen() {
        if(this.head==null){
            return false;
        }
        ListNode fast=this.head;
        ListNode slow=this.head;
        //找中间节点
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //反转
        ListNode cur=slow.next;
       
        while(cur!=null){
            ListNode curNext=cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //head从前往后走,slow从后往前走
        while(head!=slow){
            if(head.val!=slow.val){
                return false;
            }
            //偶数节点情况
            if(head.next==slow){
                return true;
            }
            head=head.next;
            slow=slow.next;
        }
        return true;
    }
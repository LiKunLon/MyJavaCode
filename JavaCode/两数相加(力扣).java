class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(l1.val+l2.val);
        ListNode cur=head;
        while(l1.next!=null || l2.next!=null){
            l1=l1.next!=null ? l1.next : new ListNode();
            l2=l2.next!=null ? l2.next : new ListNode();
            cur.next=new ListNode(l1.val+l2.val+cur.val/10);
            cur.val%=10;
            cur=cur.next;
        }
        if(cur.val>=10){
            cur.next=new ListNode(cur.val/10);
            cur.val%=10;
        }
        return head;
    }
}
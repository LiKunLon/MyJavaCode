class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead=new ListNode(-1);
        newHead.next=head;
        ListNode tmp=newHead;
        while(tmp.next!=null && tmp.next.next!=null){
            ListNode node1=tmp.next;
            ListNode node2=tmp.next.next;
            //反转
            tmp.next=node2;
            node1.next=node2.next;
            node2.next=node1;
            tmp=node1;
        }
        return newHead.next;
    }
}
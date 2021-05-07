class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    	//判空
        if(k==0 || head==null || head.next==null){
            return head;
        }
        int len=1;
        ListNode cur=head;
        //这里求链表长度
        //判断cur.next不为空，也可以保证下面※行不为空
        while(cur.next!=null){
            cur=cur.next;
            len++;
        }
        //pos是新链表
        int pos=len-k%len;
      ※cur.next=head;//首尾相连成环
      //这个循环结束，cur的位置在翻转后的链表的尾结点
        while(pos>0){
            cur=cur.next;
            pos--; 
        }
        //把环断开，尾结点置为空
        ListNode newHead=cur.next;
        cur.next=null;
        return newHead;
    }
}
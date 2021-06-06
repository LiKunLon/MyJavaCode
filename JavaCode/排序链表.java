/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        int len=getLength(head);
        int[] ans=toArray(head,len);
        Arrays.sort(ans);
        //创建个傀儡节点当头
        ListNode newHead=new ListNode(-1);
        ListNode cur=newHead;
        //再把数组转成链表
        for(int i=0;i<=len-1;i++){
            newHead.val=ans[i];
            if(i<len-1){
                newHead.next=new ListNode(-1);
                newHead=newHead.next;
            }
        }
        return cur;
    }
    //求链表长度
    public int getLength(ListNode head){
        int len=0;
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    //把链表存在数组里
    public int[] toArray(ListNode head,int len){
        int[] nums=new int[len];
        int i=0;
        while(head!=null){
            nums[i]=head.val;
            head=head.next;
            i++;
        }
        return nums;
    }
}
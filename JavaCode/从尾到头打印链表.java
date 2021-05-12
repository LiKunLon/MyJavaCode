import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer>  list=new ArrayList<>();
        if(listNode==null)return list;
        ListNode newHead=null;
        ListNode cur=listNode;
        ListNode prev=null;
        while(cur!=null){
            ListNode curNext=cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        
        while(newHead!=null){
            list.add(newHead.val);
            newHead=newHead.next;
        }
        return list;
    }
}
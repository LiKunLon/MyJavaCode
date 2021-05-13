/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
   //  ArrayList<Integer> list=new ArrayList<>(); //2
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//         ArrayList<Integer>  list=new ArrayList<>();
//         if(listNode==null)return list;
//         ListNode newHead=null;
//         ListNode cur=listNode;
//         ListNode prev=null;
//         while(cur!=null){
//             ListNode curNext=cur.next;
//             if(curNext==null){
//                 newHead=cur;
//             }
//             cur.next=prev;
//             prev=cur;
//             cur=curNext;
//         }
        
//         while(newHead!=null){
//             list.add(newHead.val);
//             newHead=newHead.next;
//         }
        
        
        //2
//         if(listNode!=null){
//             list.add(0,listNode.val);
//             printListFromTailToHead(listNode.next);
//         }
//         return list;
          
        //3
//         ArrayList<Integer> list=new ArrayList<>();
//         ListNode cur=listNode;
//         while(cur!=null){
//             list.add(0,cur.val);
//             cur=cur.next;
//         }
//         return list;
    }
}
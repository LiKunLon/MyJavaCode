class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res=null;
        for(int i=0;i<lists.length;i++){
            res=merge(res,lists[i]);
        }
        return res;
    }
    public ListNode merge(ListNode a,ListNode b){
        if(a==null)return b;
        if(b==null)return a;
        ListNode newHead=new ListNode(-1);
        ListNode cur=newHead;
        ListNode list1=a;
        ListNode list2=b;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                cur.next=list1;
                list1=list1.next;
                cur=cur.next;
            }else{
                cur.next=list2;
                list2=list2.next;
                cur=cur.next;
            }
        }
        if(list1!=null){
            cur.next=list1;
        }else{
            cur.next=list2;
        }
        return newHead.next;
    }
}
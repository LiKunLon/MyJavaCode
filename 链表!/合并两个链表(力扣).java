class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode node=list1;
        for(int i=0;i<a-1;i++){
            node=node.next;
        }
        ListNode nodeNext=node.next;
        for(int i=0;i<(b-a+1);i++){
            nodeNext=nodeNext.next;
        }
        node.next=list2;
        while(node.next!=null){
            node=node.next;
        }
        node.next=nodeNext;
        return list1;
    }
}
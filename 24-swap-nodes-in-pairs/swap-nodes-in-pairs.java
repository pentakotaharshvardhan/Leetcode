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
    public ListNode swapPairs(ListNode head) {
        boolean first=true;
        ListNode temp=head;
        if(temp==null || temp.next==null) return head;
        ListNode k=temp;
        while(temp!=null){
            ListNode t=temp.next;
            if(t==null) return head;
            if(temp.next.next!=null) temp.next=temp.next.next;
            else temp.next=null;
            t.next=temp;
            if(!first) k.next=t;
            if(first) {
                head=t;
                first=false;
            }
            //System.out.println(temp.val);
            k=temp;
            temp=temp.next;
        }
        return head;
    }
}
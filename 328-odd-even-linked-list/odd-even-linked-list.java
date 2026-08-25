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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        ListNode temp=head.next;
        ListNode t1=head;
        ListNode t2=head.next;
        ListNode last=t1;
        while(t1!=null && t2!=null){
            t1.next=t2.next;
            last=t1;
            t1=t1.next;
            if(t1!=null){
                t2.next=t1.next;
                t2=t2.next;
            }
        }
        if(t1==null) t1=last;
        t1.next=temp;
        return head;
    }
}
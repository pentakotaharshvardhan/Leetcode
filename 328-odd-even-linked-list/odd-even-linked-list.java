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
        if(head==null ||head.next==null) return head;
        ListNode even=head.next;
        ListNode odd=head;
        ListNode tail=even;
        while((odd.next!=null ) && (tail.next!=null )){
            odd.next=odd.next.next;
            if(odd!=null) odd=tail.next;
            tail.next=tail.next.next;
            if(tail!=null) tail=tail.next;
        }
        odd.next=even;
        return head;
    }
}
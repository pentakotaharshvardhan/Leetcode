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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
        ListNode newhead=reverse(slow);
        ListNode temp=head;
        while(temp!=null && newhead!=null){
            if(temp.val!=newhead.val) return false;
            temp=temp.next;
            newhead=newhead.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newhead=reverse(head.next);
        if(newhead!=null){
            head.next.next=head;
            head.next=null;
        }
        return newhead;
    }
}
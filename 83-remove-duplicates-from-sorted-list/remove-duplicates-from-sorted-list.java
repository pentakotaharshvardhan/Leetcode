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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        while(temp!=null){
            ListNode t=temp.next;
            while(t!=null && temp.val==t.val){
                t=t.next;
            }
            if(t!=null) temp.next=t;
            else temp.next=null;
            temp=temp.next;
        }
        return head;
    }
}
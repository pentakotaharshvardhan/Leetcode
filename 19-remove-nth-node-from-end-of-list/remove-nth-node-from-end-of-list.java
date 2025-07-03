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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int ixd=0;
        ListNode temp=head;
        while(temp!=null){
            ixd++;
            temp=temp.next;
        }
        if(ixd==n){
            return head.next;
        }
        ixd-=n;
        if(ixd<=0){
            return null;
        }
        temp=head;
        while(ixd>1){
            ixd--;
            temp=temp.next;
        }
        if(temp.next.next!=null){
            temp.next=temp.next.next;
        }
        else temp.next=null;
        return head;
    }
}
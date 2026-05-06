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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null ||head.next==null) return head;
        int length=0;
        ListNode tail=head;
        ListNode kthNode=head;
        ListNode slow=head;
        ListNode fast=head;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        k=k%(length+1);
        if(k==0) return head;
        for(int i=1;i<=k+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //System.out.println(tail.val+" "+slow.val);
        tail.next=head;
        head=slow.next;
        slow.next=null;
        return head;
    }
}
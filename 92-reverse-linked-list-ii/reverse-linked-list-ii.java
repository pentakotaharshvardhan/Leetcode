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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=head;
        ListNode forward=head;
        ListNode temp=head;
        int l=left!=1?left-1:left;
        for(int i=1;i<=right;i++){
            if(i==l) prev=temp;
            if(i==right) forward=temp;
            temp=temp.next;
        }
        ListNode leftNode=left!=1?prev.next:prev;
        ListNode rightNode=forward;
        forward=forward.next;
        rightNode.next=null;
        System.out.println(leftNode.val);
        rightNode=reverse(leftNode);
        if(left!=1) prev.next=rightNode;
        else head=rightNode;
        leftNode.next=forward;
        return head;
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverse(head.next);
        ListNode m=head.next;
        m.next=head;
        head.next=null;
        return newHead;
    }
}
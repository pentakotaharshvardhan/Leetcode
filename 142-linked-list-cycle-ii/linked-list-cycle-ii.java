/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        int length=0;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode temp=slow;
                do{
                    length++;
                    temp=temp.next;
                }while(temp!=fast);
                break;
            }
        }
        if(length==0) return null;
        ListNode f=head;
        ListNode s=head;
        while(length>0){
            length--;
            s=s.next;
        }
        while(s!=f){
            f=f.next;
            s=s.next;
        }
        return f;
    }
}
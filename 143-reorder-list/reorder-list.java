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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return ;
        ListNode newhead=head;
        ListNode temp=head.next;
        ListNode mid=getMiddle(head);
        ListNode rev=reverse(mid.next);
        //System.out.println(rev.val);
        boolean istrue=true;
        while(temp!=null && rev!=null){
            if(istrue){
                newhead.next=rev;
                rev=rev.next;
                istrue=false;
            }
            else{
                newhead.next=temp;
                temp=temp.next;
                istrue=true;
            }
            newhead=newhead.next;
        }
    }
    private ListNode reverse(ListNode list){
        if(list==null || list.next==null){
            return list;
        }
        ListNode newhead=reverse(list.next);
        ListNode m=list.next;
        m.next=list;
        list.next=null;
        return newhead;
    }
    private ListNode getMiddle(ListNode head){
        if (head == null || head.next == null) return head;

    ListNode slow = head;
    ListNode fast = head;
    ListNode prev = null;

    while (fast != null && fast.next != null) {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
    }

    return prev;
    }
}
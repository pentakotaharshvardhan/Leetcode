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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        boolean istrue=true;
        int t1=0;
        ListNode prev=head;
        while(temp!=null){
            t1++;
            ListNode t=null;
            ListNode n=temp.next;
            if(t1==k){
                if(istrue){
                    t=reverse(prev,temp);
                    head=t;
                    prev.next=n;
                    //System.out.println(temp.val+" "+prev.next.val+" "+n.val);
                    istrue=false;
                }
                else{
                    ListNode s=prev.next;
                    t=reverse(s,temp);
                    prev.next.next=n;
                    prev.next=t;
                    prev=s;
                }
                temp=prev;
                t1=0;
            }
            temp=temp.next;
        }
        return head;
    }
    public ListNode reverse(ListNode head,ListNode tail){
        if(head==tail || head==null || head.next==null) return head;
        ListNode newhead=reverse(head.next,tail);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
}
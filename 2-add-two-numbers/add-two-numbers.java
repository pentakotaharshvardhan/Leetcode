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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-99);
        int carry=0;
        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            int s=sum%10;
            if(head.val==-99){
                head.val=s;
            }
            else{
                ListNode temp=new ListNode(s);
                ListNode t=head;
                while(t.next!=null){
                    t=t.next;
                }
                t.next=temp;
            }
            carry=sum/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int s=(l1.val+carry)%10;
            if(head.val==-99){
                head.val=s+carry;
            }
            else{
                ListNode temp=new ListNode(s);
                ListNode t=head;
                while(t.next!=null){
                    t=t.next;
                }
                t.next=temp;
            }
            carry=(l1.val+carry)/10;
            l1=l1.next;
        }
        while(l2!=null){
            int s=(l2.val+carry)%10;;
            if(head.val==-99){
                head.val=s+carry;
            }
            else{
                ListNode temp=new ListNode(s);
                ListNode t=head;
                while(t.next!=null){
                    t=t.next;
                }
                t.next=temp;
            }
            carry=(l2.val+carry)/10;
            //System.out.println(carry);
            l2=l2.next;
        }
        if(carry!=0){
            ListNode ls=new ListNode(carry);
            ListNode t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=ls;
        }
        return head;
    }
}
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
        ListNode prev=head;
        if(head==null || head.next==null) return head==null?null:head;
        int val=head.val==head.next.val?head.val:-999;
        if(head.next==null) return head;
        while(head!=null){
           // System.out.println(head.val);
            if(head.val==val){
                head=head.next;
                continue;
            }
            else{
                if(head.next!=null && head.val==head.next.val){
                    //System.out.println("*");
                    val=head.val;
                    continue;
                }
                break;
            }
        }
        //System.out.println("loop2");
        if(head==null || head.next==null) return head==null?null:head;
        while(temp!=null && temp.next!=null){
            //System.out.println(temp.val);
            if(temp.val==temp.next.val){
                int val2=temp.val;
                temp=temp.next;
                while(temp!=null && val2==temp.val){
                    temp=temp.next;
                }
                prev.next=temp;
            }
            else{
                prev=temp;
                temp=temp.next;
            }
        }    
        return head;
    }
}
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        ListNode prev=null;
        while(list1!=null && list2!=null){
            ListNode temp=new ListNode();
            if(list1.val<list2.val){
                temp.val=list1.val;
                list1=list1.next;
            }
            else{
                temp.val=list2.val;
                list2=list2.next;
            }
            if(prev!=null) prev.next=temp;
            if(head==null) {
                head=temp;
            }
            prev=temp;
        }
        while(list1!=null){
            ListNode temp=new ListNode();
            temp.val=list1.val;
            if(prev!=null) prev.next=temp;
            if(head==null) {
                head=temp;
            }
            list1=list1.next;
            prev=temp;
        }
        while(list2!=null){
            //if(prev!=null) System.out.println(prev.val+" "+list2.val);
            ListNode temp=new ListNode();
            temp.val=list2.val;
            if(prev!=null) prev.next=temp;
            if(head==null) {
                head=temp;
            }
            list2=list2.next;
            prev=temp;
        }
        return head;
    }
}
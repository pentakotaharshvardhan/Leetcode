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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode kstart=head;
        ListNode klast=head;
        ListNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        temp=head;
        int t=k>length-k+1?k:length-k+1;
        //System.out.println(k+" "+t);
        for(int i=1;i<=t;i++){
            if(i==k) kstart=temp;
            if(i==length-k+1) klast=temp;
            temp=temp.next;
        }
        int temp1=kstart.val;
        kstart.val=klast.val;
        klast.val=temp1;
        return head;
    }
}
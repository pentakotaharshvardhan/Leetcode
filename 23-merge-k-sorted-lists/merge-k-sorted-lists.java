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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int k=lists.length;
        for(int i=0;i<k;i++){
            ListNode temp=lists[i];
            while(temp!=null){
                pq.add(temp.val);
                temp=temp.next;
            }
        }
        ListNode head=null;
        ListNode temp=head;
        int l=pq.size();
        for(int i=0;i<l;i++){
            ListNode t1=new ListNode(pq.poll());
            if(head==null){
                head=t1;
                temp=t1;
            }
            else{
                temp.next=t1;
                temp=t1;
            }
        }
        return head;
    }
}
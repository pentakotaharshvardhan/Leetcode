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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int div=length/k;
        int mod=length%k;
        int i=0;
        System.out.println(length);
        if(length<=k){
            while(length>0){
                ListNode t=head;
                head=head.next;
                t.next=null;
                ans[i++]=t;
                length--;
            }
            return ans;
        }
        ListNode t=head;
        while(t!=null){
            //System.out.println(div+" "+mod);
            ListNode t1=t;
            for(int j=1;j<div && t!=null;j++){
                t=t.next;
            }
            if(mod>0) {
                t=t.next;
                mod--;
            }
            ListNode tail=t;
            if(t!=null) t=t.next;
            if(tail!=null) tail.next=null;
            ans[i++]=t1;
        }
        return ans;
    }
}
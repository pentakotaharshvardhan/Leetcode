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
    static Stack<Integer> stk=new Stack<>();
    public int[] nextLargerNodes(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int[] ans=new int[n];
        temp=head;
        helper(temp);
        int j=0;
        while(temp!=null){
            ans[j++]=temp.val;
            //System.out.println(temp.val);
            temp=temp.next;
        }
        while(!stk.isEmpty()){
            stk.pop();
        }
        return ans;
    }
    public void helper(ListNode head){
        if(head==null){
            return ;
        }
        helper(head.next);
        while(!stk.isEmpty() && stk.peek()<=head.val){
            stk.pop();
        }
        int x=head.val;
        if(stk.isEmpty()) head.val=0;
        else head.val=stk.peek();
        //System.out.println(head.val);
        stk.push(x);
    }
}
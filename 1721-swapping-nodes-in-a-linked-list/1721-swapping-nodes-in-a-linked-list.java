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
        if(head==null || head.next==null)
            return head;
        ListNode first=head;
        ListNode second=head;
        int count=1;
        while(count!=k){
            count++;
            first=first.next;
        }

        ListNode temp=first.next;
        count=1;
        while(temp!=null){
            count++;
            temp=temp.next;
            second=second.next;
        }
        if(first!=null &&second!=null){
        int v1=first.val;
        int v2=second.val;
        first.val=v2;
        second.val=v1;
        }
        return head;
    }
}